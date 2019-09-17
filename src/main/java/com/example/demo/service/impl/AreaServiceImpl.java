package com.example.demo.service.impl;

import com.example.demo.entity.Area;
import com.example.demo.mapper.AreaMapper;
import com.example.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper areaMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {

        return areaMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Area record) {

        return areaMapper.insert(record);
    }

    @Override
    public Area selectByPrimaryKey(Integer id) {

        return areaMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Area> selectAll() {

        return areaMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Area record) {

        return areaMapper.updateByPrimaryKey(record);
    }
}


