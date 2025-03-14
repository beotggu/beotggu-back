package com.example.demo.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
@Tag(name="User",description = "사용자 정보")
public class UserController {
    @PostMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/info")
    public String getUserInfo(){
        return "user info";
    }
}
