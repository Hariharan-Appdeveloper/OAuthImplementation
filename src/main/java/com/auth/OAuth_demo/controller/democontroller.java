package com.auth.OAuth_demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class democontroller {

    @GetMapping("/public")
    public String public_method(){
        return "this is a public api";
    }

    @GetMapping("/private")
    public String private_method(){
        return "this is private api";
    }
}
