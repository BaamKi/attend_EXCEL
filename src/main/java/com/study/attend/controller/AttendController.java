package com.study.attend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttendController {



    @GetMapping("/health")
    public String healthCheck()
    {
        return "health";
    }


}
