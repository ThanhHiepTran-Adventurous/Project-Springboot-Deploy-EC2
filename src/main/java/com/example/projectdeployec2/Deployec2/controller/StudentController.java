package com.example.projectdeployec2.Deployec2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class StudentController {


    @GetMapping("/hello")
    public String getAll() {
        return "Xin chào EC2!!!!!!!";
    }

}
