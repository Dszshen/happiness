package com.uuit.happiness.controller.wall;

import com.alibaba.fastjson.JSONArray;
import com.uuit.happiness.service.wall.WallService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String wall(@RequestParam(required = false,defaultValue ="1") Integer pageNo,
                       @RequestParam(required = false,defaultValue = "20") Integer pageSize,
                       Model model){
        model.addAttribute("wallList",wallService.wall(pageNo,pageSize));
        return "front/wall/wall";
    }

    /**
     * 获取更多的数据
     * @return
     */
    @RequestMapping("more")
    public String more(@RequestParam(required = false,defaultValue ="1") Integer pageNo,
                                 @RequestParam(required = false,defaultValue = "20") Integer pageSize,Model model){

        model.addAttribute("moreList",wallService.wall(pageNo,pageSize));

        return "front/wall/wall_more";
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

    @RequestMapping("story")
    public String detail(){
        return "front/wall/story";
    }

    @RequestMapping("add")
    public void add(){

    }
}
