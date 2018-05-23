package com.twooldfree.ichick.controller;

import com.twooldfree.ichick.model.PhotoGraph;
import com.twooldfree.ichick.service.PhotoGraphService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/photograph")
public class PhotoGraphController {

    @Autowired
    public PhotoGraphService photoGraphService;

    @RequestMapping("/myphotograph")
    public ModelAndView myPhotoGraph(){

        List<PhotoGraph> photoGraphList = photoGraphService.selectAll("111");

        Map data = new HashMap();
        data.put("photoGraphList",photoGraphList);

        return new ModelAndView("/photograph/myphotograph",data);

    }



}
