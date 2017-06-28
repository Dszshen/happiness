package com.uuit.happiness.controller.wall;

import com.uuit.happiness.service.wall.WallService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by zhangbin on 2017/6/27 0027.
 */
@Controller
@RequestMapping("wall")
public class WallController {

    @Resource
    private WallService wallService;

    @RequestMapping("index")
    public String wall(Model model){
        model.addAttribute("wallList",wallService.wall());
        return "front/wall/wall";
    }
}
