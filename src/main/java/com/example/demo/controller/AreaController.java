package com.example.demo.controller;

import com.example.demo.entity.Area;
import com.example.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("area")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @RequestMapping("selectByPrimaryKey")
    public Area getAllArea(){
        Integer id = 1;
        Area area = areaService.selectByPrimaryKey(id);
        return area;
    }
}