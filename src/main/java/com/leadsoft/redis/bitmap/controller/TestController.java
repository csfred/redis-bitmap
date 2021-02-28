package com.leadsoft.redis.bitmap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cs
 * @date 2021/02/26
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/user")
    public String testUser(@RequestParam("user") String userName){
        return userName;
    }

    @RequestMapping("/getName")
    public String getName(){
        return "马云";
    }
}
