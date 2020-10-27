package com.offcn.springsessiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringsessiondemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsessiondemoApplication.class, args);
        System.out.println("这个项目已经上传过git");
        System.out.println("正在创建一个分支");
        System.out.println("创建第二个分支");
    }

}
