package com.example.pasture.controller;

import com.example.pasture.model.Do.Equipment;
import com.example.pasture.service.intf.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/equipment")
public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService;

    @GetMapping("/test")
    public String test(){
        return "Hello";
    }

    @RequestMapping("/getEquipments")
    @Cacheable(value = "euipments")
    public List<Equipment> getEquipments(){
        return equipmentService.list();
    }
}
