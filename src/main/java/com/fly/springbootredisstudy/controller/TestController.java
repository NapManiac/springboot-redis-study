package com.fly.springbootredisstudy.controller;


import com.fly.springbootredisstudy.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private RedisUtil redisUtil;

    @GetMapping(value = "/setKey")
    public String setKey(String key, String value) {
        redisUtil.set(key, value);
        return "setKey-----> key : " + key + " value : " + value;
    }

    @GetMapping(value = "/getValue")
    public String getValue(String key) {
        return "getValue-----> key : " + key + " value : "+ redisUtil.get(key);
    }
}
