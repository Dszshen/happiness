package com.uuit.happiness.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhangbin on 2017/7/13 0013.
 */
@Controller
@RequestMapping("personal")
public class PersonalController {

  @RequestMapping(method = RequestMethod.GET,value="{path}.html")
  public String profile(@PathVariable String path){
    return "front/personal/"+path;
  }

  /**
   *
   * 个人资料
   */
 // @RequestMapping("profile.html")
 // public String profile(){
  //  return "front/personal/profile";
  //}

  /**
   * 个人信息编辑
   * @return
  @RequestMapping("edit.html")
  public String edit(){
    return "front/personal/edit";
  }

  *//**
   * 发送文字
   * @return
   *//*
  @RequestMapping("word.html")
  public String word(){
    return "front/personal/sendWord";
  }

  *//**
   * 发送图片
   * @return
   *//*
  @RequestMapping("picture.html")
  public String picture(){
    return "front/personal/sendPicture";
  }*/
}
