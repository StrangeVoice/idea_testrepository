package com.hx.service;

import com.hx.dao.HelloDao;

/**
 * Created by Administrator on 2018/7/1.
 */
public class HelloService {
    public String sayHelloService(String name){
        HelloDao helloDao = new HelloDao();
        return helloDao.sayHelloDao(name);
    }
}
