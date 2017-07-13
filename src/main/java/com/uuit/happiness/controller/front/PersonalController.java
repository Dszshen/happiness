package com.uuit.happiness.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhangbin on 2017/7/13 0013.
 */
@Controller
@RequestMapping("personal")
public class PersonalController {

  /**
   *
   * @return 登陆静态页面
   */
  @RequestMapping("profile.html")
  public String profile(){
    return "front/personal/profile";
  }

  @RequestMapping("word.html")
  public String word(){
    return "front/personal/sendWord";
  }

  @RequestMapping("picture.html")
  public String picture(){
    return "front/personal/sendPicture";
  }
}
