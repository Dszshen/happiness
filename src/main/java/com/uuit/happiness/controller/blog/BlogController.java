package com.uuit.happiness.controller.blog;

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
@RequestMapping("blog")
public class BlogController {

    /**
     * 博客
     * @param model
     * @return
     */
    @RequestMapping("index")
    public String wall(Model model){
        return "front/blog/index";
    }
}
