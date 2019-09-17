package com.example.demo.service;

import com.example.demo.entity.Area;

import java.util.List;


public interface AreaService {
    int deleteByPrimaryKey(Integer id);

    int insert(Area record);

    Area selectByPrimaryKey(Integer id);

    List<Area> selectAll();

    int updateByPrimaryKey(Area record);
}
