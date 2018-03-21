package com.wx.order.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("hello")
public class DemoController {

    @GetMapping
    public String hello() {
        return "hello world!";
    }
}
