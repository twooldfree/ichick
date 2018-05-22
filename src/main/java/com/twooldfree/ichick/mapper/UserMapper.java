package com.twooldfree.ichick.mapper;

import com.twooldfree.ichick.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(String serviceId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String serviceId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKeyWithBLOBs(User record);

    int updateByPrimaryKey(User record);
}