package com.twooldfree.ichick.mapper;

import com.twooldfree.ichick.model.PhotoGraph;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PhotoGraphMapper {
    int deleteByPrimaryKey(String photographId);

    int insert(PhotoGraph record);

    int insertSelective(PhotoGraph record);

    PhotoGraph selectByPrimaryKey(String photographId);

    int updateByPrimaryKeySelective(PhotoGraph record);

    int updateByPrimaryKey(PhotoGraph record);

    List<PhotoGraph> selectAll(String user_id);

    List<PhotoGraph> selectByPage(Map param);

}