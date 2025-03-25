package com.spring.authentication.auth20.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerOAuth {

    @GetMapping("/")
    public String getAuth(){
        return "secured api";
    }
}
