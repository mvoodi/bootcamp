package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/hello")
    public String name(@RequestParam String name){
        return name+" hello!";
    }

    @PostMapping("/register")
    public String register (@RequestParam String name){
        return name + " registered!";
    }

    @GetMapping("/login")
    public boolean login(@RequestParam String username,@RequestParam int password){
        System.out.println("Entered data: " + username + " " + password);
        return (true);
    }

}
