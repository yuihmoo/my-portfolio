package com.example.springwebsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MainController {

    /**
     * 메인 페이지
     * @return
     */
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
