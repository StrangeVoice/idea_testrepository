package com.hx.controller;

import com.hx.service.HelloService;

/**
 * Created by Administrator on 2018/7/1.
 */
public class HelloController {
    public static void main(String[] args) {
        HelloService helloService = new HelloService();
        System.out.println(helloService.sayHelloService("张三"));
    }
}
