package com.bbjh.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class ApiTestController {

    @RequestMapping("/hello")
    public String test() {
        return "test";
    }
}
