package com.yfd.service;

import com.yfd.domain.ResponseResult;
import com.yfd.domain.entity.User;

public interface LoginService {

    ResponseResult login(User user);

    ResponseResult logout();
}
