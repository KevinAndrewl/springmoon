package com.jiang.springmoontest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JFY
 * @date 2021年11月03日 10:11
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        return "hello,world";
    }


}
