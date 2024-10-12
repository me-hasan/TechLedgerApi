package com.binarydesign.techledgerapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/he")
    public String greeting(){
        return "Hello worl!";
    }
}
