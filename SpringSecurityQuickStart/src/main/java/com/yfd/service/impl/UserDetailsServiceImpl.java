package com.yfd.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.yfd.domain.entity.LoginUser;
import com.yfd.domain.entity.User;
import com.yfd.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Objects;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        //根据用户名查询用户信息
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<User>();
        queryWrapper.eq(User::getUserName,userName);
        User user = userMapper.selectOne(queryWrapper);
        if(Objects.isNull(user)){
            throw new  RuntimeException("用户信息不存在");
        }
        //根据用户信息封装loginuser
        return new LoginUser(user);
    }
}
