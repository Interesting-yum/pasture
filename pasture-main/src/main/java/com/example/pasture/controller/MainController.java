package com.example.pasture.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/main")
@RestController
public class MainController {

    public String test(){
        Equipment equipment = new Equipment();
        return "Hello";
    }
}
