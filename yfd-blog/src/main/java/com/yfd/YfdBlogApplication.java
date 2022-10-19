package com.yfd;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yfd.mapper")
public class YfdBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(YfdBlogApplication.class,args);
    }
}
