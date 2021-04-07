package com.example.sprinjsonrpcexample.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
@RequiredArgsConstructor
public class RestEndpoints {

    @GetMapping("/test")
    public String test() {
        return "test rest controller response";
    }
}
