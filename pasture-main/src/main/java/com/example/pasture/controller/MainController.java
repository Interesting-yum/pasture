package com.example.pasture.controller;

import com.example.pasture.model.Do.Equipment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/main")
@RestController
public class MainController {

    @RequestMapping("/test")
    public String test(){
        Equipment equipment = new Equipment();
        return "Hello";
    }
}
