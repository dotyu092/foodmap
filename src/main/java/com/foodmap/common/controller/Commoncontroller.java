package com.foodmap.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Commoncontroller {

    @GetMapping("/api/test")
    public String helle() {
        return "안녕";
    }
}
