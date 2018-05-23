package com.twooldfree.ichick.service;

import com.twooldfree.ichick.model.PhotoGraph;

import java.util.List;

public interface PhotoGraphService {
    int deleteByPrimaryKey(String photographId);

    int insert(PhotoGraph record);

    int insertSelective(PhotoGraph record);

    PhotoGraph selectByPrimaryKey(String photographId);

    int updateByPrimaryKeySelective(PhotoGraph record);

    int updateByPrimaryKey(PhotoGraph record);

    List<PhotoGraph> selectAll(String user_id);
}