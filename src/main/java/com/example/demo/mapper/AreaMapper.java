package com.example.demo.mapper;

import com.example.demo.entity.Area;

import java.util.List;

public interface AreaMapper {

    /**
     * @author linda
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @author
     * @param record
     * @return
     */
    int insert(Area record);

    /**
     * @author
     * @param id
     * @return
     */
    Area selectByPrimaryKey(int id);

    /**
     * @author
     * @return
     */
    List<Area> selectAll();

    /**
     * @author
     * @param record
     * @return
     */
    int updateByPrimaryKey(Area record);
}