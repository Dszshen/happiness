package com.uuit.happiness.controller.front;

import com.alibaba.fastjson.JSONObject;
import com.uuit.happiness.common.util.JsonResult;
import com.uuit.happiness.service.user.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 *
 * @author zhangbin
 * 登陆接口
 *
 */
@Controller
public class LoginController {

    @Resource
    private UserService userService;

    /**
     *
     * @return 登陆静态页面
     */
    @RequestMapping("login.html")
    public String loginPage(){
        return "front/login";
    }

    @RequestMapping("forgetPassword.html")
    public String forgetPassword(){
        return "front/forgetPassword";
    }

    @RequestMapping(method=RequestMethod.POST,value = "pwdReset")
    @ResponseBody
    public String pwdReset(@RequestBody JSONObject params){

        if(StringUtils.isEmpty(params.getString("mobile"))){
            return "对不起，请填写电话号码！";
        }

        if(StringUtils.isEmpty(params.getString("username"))){
            return "对不起，请填写账号！";
        }



        return "front/forgetPassword";
    }


    /**
     * 登陆系统
     * @param loginInfo
     * @return 返回登陆信息
     */
    @RequestMapping(method = RequestMethod.POST,value="login")
    @ResponseBody
    public JsonResult<JSONObject> login(@RequestBody JSONObject loginInfo){
        return userService.login(loginInfo);
    }
}
