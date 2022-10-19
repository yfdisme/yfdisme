package com.yfd;

import com.yfd.domain.entity.User;
import com.yfd.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public  void main() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

}