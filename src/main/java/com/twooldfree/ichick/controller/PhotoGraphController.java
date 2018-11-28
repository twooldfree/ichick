package com.twooldfree.ichick.controller;

import com.twooldfree.ichick.model.PhotoGraph;
import com.twooldfree.ichick.service.PhotoGraphService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/photograph")
public class PhotoGraphController {

    @Autowired
    public PhotoGraphService photoGraphService;

    /**
     * 相册页面跳转
     * @return
     */
    @RequestMapping("/myphotograph")
    public ModelAndView myPhotoGraph(){

        //首页默认查询前8条
        List<PhotoGraph> photoGraphList = photoGraphService.selectByPage("111",0,8);

        Map data = new HashMap();
        data.put("photoGraphList",photoGraphList);

        return new ModelAndView("/photograph/myphotograph",data);

    }

    /**
     * 异步加载相册数据
     * @param startnum
     * @param length
     * @return
     */
    @RequestMapping("/getphotegraphsbypage")
    public @ResponseBody Object getphotegraphsbypage(int startnum,int length){

        List<PhotoGraph> photoGraphList = photoGraphService.selectByPage("111",startnum,length);

        return photoGraphList;

    }


    @RequestMapping("/goAddPhotograph")
    public ModelAndView goAddPhotograph(){
        return new ModelAndView("/photograph/addphotograph");
    }


}
