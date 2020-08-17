package com.example.pasture.controller;

import com.example.pasture.model.entity.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipment")
public class EquipmentController {
    @GetMapping("/test")
    public String test(){
        return "Hello";
    }
}
