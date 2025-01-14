package com.springdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ncc")
public class HelloWordController {

    @GetMapping
    public String helloWord()
    {
        return "welcome to springboot";
    }

    @GetMapping("/welcome")
    public String welclome()
    {
        return "welcome To  Spring boot  ";
    }

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello  To  Spring boot  ";
    }
}
