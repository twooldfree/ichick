package com.twooldfree.ichick.mapper;

import com.twooldfree.ichick.model.Photo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PhotoMapper {
    int deleteByPrimaryKey(String photoId);

    int insert(Photo record);

    int insertSelective(Photo record);

    Photo selectByPrimaryKey(String photoId);

    int updateByPrimaryKeySelective(Photo record);

    int updateByPrimaryKeyWithBLOBs(Photo record);

    int updateByPrimaryKey(Photo record);
}