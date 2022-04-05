package com.heng.yimusic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class DefaultController {

    @GetMapping
    public String sayHello(){
        return "hello,music";
    }
}
