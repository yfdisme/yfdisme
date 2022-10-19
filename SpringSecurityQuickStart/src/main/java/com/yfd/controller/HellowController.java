package com.yfd.controller;

import com.yfd.domain.ResponseResult;
import com.yfd.domain.entity.User;
import com.yfd.mapper.UserMapper;
import com.yfd.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hellow")
public class HellowController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private LoginService loginService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @GetMapping("/one")
    public String Hellow() {
//        String encode = passwordEncoder.encode("1234");
//        System.out.println(encode);

        List<User> users = userMapper.selectList(null);
        System.out.println(users);
        return "hellow";
    }

    @PostMapping("/login")
    public ResponseResult logIn(@RequestBody  User user){
        return loginService.login(user);
    }

    @PostMapping("/logout")
    public ResponseResult logout(){
        return loginService.logout();
    }
}
