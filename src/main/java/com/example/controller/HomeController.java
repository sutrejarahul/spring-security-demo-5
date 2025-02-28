package com.example.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/") // Optional, just to keep it clean
public class HomeController {

    @GetMapping
    public String greeting(HttpServletRequest request) {
        return "Hello Welcome to Spring Security Demo " + request.getSession().getId();
    }

    @GetMapping("about")
    public String about(HttpServletRequest request) {
        return "This is Spring Security Demo Tutorial " + request.getSession().getId();
    }
}
