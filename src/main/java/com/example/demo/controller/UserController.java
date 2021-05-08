package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @GetMapping("getStudentById")
    public String getStudentById(@RequestParam(value = "userName") String userName){
        return "vishali"+userName;
    }
}
