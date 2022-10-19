package com.yfd.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yfd.domain.ResponseResult;
import com.yfd.domain.entity.LoginUser;
import com.yfd.domain.entity.User;
import com.yfd.enums.AppHttpCodeEnum;
import com.yfd.mapper.UserMapper;
import com.yfd.service.LoginService;
import com.yfd.utils.JwtUtil;
import com.yfd.utils.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Objects;

@Service
public class LoginServiceImpl extends ServiceImpl<UserMapper, User> implements LoginService {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private RedisCache redisCache;
    @Override
    public ResponseResult login(User user) {
    //Authenticatinmanager authenticate 方法进行认证
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(user.getUserName(),user.getPassword());
        Authentication authenticate = authenticationManager.authenticate(usernamePasswordAuthenticationToken);
        //没通过
        if(Objects.isNull(authenticate)){
            return ResponseResult.errorResult(AppHttpCodeEnum.LOGIN_ERROR);
        }
        //通过认证通过，生成token
        LoginUser loginUser = (LoginUser)authenticate.getPrincipal();
        String jwt = JwtUtil.createJWT(loginUser.getUser().getId().toString());
        HashMap<String, String> resultMap = new HashMap<>();
        resultMap.put("token",jwt);
        //存入redis
        redisCache.setCacheObject("loginuser:"+loginUser.getUser().getId().toString(),loginUser);

        return ResponseResult.okResult(resultMap);
    }

    @Override
    public ResponseResult logout() {
        UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        LoginUser principal = (LoginUser) authentication.getPrincipal();
        Long id = principal.getUser().getId();
        return  ResponseResult.okResult("注销状态"+(redisCache.deleteObject("loginuser:"+id.toString())?"成功":"失败"));
    }
}
