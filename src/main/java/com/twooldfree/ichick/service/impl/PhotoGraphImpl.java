package com.twooldfree.ichick.service.impl;

import com.twooldfree.ichick.mapper.PhotoGraphMapper;
import com.twooldfree.ichick.model.PhotoGraph;
import com.twooldfree.ichick.service.PhotoGraphService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PhotoGraphImpl implements PhotoGraphService {

    @Autowired
    public PhotoGraphMapper photoGraphMapper;


    @Override
    public int deleteByPrimaryKey(String photographId) {
        return photoGraphMapper.deleteByPrimaryKey(photographId);
    }


    @Override
    public int insert(PhotoGraph record) {
        return photoGraphMapper.insert(record);
    }


    @Override
    public int insertSelective(PhotoGraph record) {
        return photoGraphMapper.insertSelective(record);
    }


    @Override
    public PhotoGraph selectByPrimaryKey(String photographId) {
        return photoGraphMapper.selectByPrimaryKey(photographId);
    }

    @Override
    public int updateByPrimaryKeySelective(PhotoGraph record) {
        return photoGraphMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PhotoGraph record) {
        return photoGraphMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<PhotoGraph> selectAll(String user_id) {
        return photoGraphMapper.selectAll(user_id);
    }

    @Override
    public List<PhotoGraph> selectByPage(String user_id,int startnum,int length){

        Map param = new HashMap<String,String>();
        param.put("user_id",user_id);
        param.put("startnum",startnum);
        param.put("length",length);

        return photoGraphMapper.selectByPage(param);

    }

}