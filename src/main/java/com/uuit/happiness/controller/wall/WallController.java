package com.uuit.happiness.controller.wall;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhangbin on 2017/6/27 0027.
 */
@Controller
@RequestMapping("wall")
public class WallController {


    @RequestMapping("index")
    public String wall(){
        return "front/wall/wall";
    }
}
