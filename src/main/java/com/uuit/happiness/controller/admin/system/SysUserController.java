package com.uuit.happiness.controller.admin.system;

import com.uuit.happiness.bean.SysUser;
import com.uuit.happiness.common.util.JsonResult;
import com.uuit.happiness.service.system.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangbin on 2016/6/26.
 * 用户管理
 *
 */
@RestController
@RequestMapping("sysUser")
public class SysUserController {

    @Autowired
    SysUserService sysuserService;

    @RequestMapping(method = RequestMethod.GET,value="add")
    public JsonResult addUser(@RequestParam("user") SysUser user){

        SysUser u = sysuserService.add(user);

        return JsonResult.success(u);
    }

    @RequestMapping(method = RequestMethod.GET,value="list")
    public JsonResult list(){
        return JsonResult.success(sysuserService.findAll());
    }

}
