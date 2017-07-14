package com.uuit.happiness.controller.front;

import com.alibaba.fastjson.JSONObject;
import com.uuit.happiness.common.util.JsonResult;
import com.uuit.happiness.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 *
 * @author zhangbin
 * 注册
 *
 */
@Controller
public class RegisterController {

    @Resource
    private UserService userService;

    /**
     * 注册静态页面
     * @return
     */
    @RequestMapping("register.html")
    public String registerPage(){
        return "front/register";
    }

    @RequestMapping("register")
    public JsonResult<JSONObject> register(@RequestBody JSONObject loginInfo){
        return null;
    }

}
