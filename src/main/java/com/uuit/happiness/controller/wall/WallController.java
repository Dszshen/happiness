package com.uuit.happiness.controller.wall;

import com.alibaba.fastjson.JSONArray;
import com.uuit.happiness.service.wall.WallService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by zhangbin on 2017/6/27 0027.
 */
@Controller
@RequestMapping("wall")
public class WallController {

    @Resource
    private WallService wallService;

    /**
     * 获取照片墙数据
     * @param model
     * @return
     */
    @RequestMapping("index")
    public String wall(Model model){
        model.addAttribute("wallList",wallService.wall());
        return "front/wall/wall";
    }

    @RequestMapping("book")
    public String book(){
        return "front/wall/book";
    }

    @RequestMapping("book/regions/{regionNum}")
    @ResponseBody
    public JSONArray bookRegion(@PathVariable String regionNum){
        JSONArray jsonArray = new JSONArray();

        return jsonArray;
    }

    @RequestMapping("detail")
    public String detail(){
        return "front/wall/detail";
    }

    @RequestMapping("add")
    public void add(){

    }
}
