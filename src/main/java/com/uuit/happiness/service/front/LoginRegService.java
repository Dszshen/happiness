package com.uuit.happiness.service.front;

import com.alibaba.fastjson.JSONObject;
import com.uuit.happiness.bean.User;
import com.uuit.happiness.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhangbin on 2017/7/14 0014.
 */

@Service
public class LoginRegService {

  @Resource
  private UserDao userDao;

  /**
   * 重置密码
   * @param pwdParams
   */
  public void resetPwd(JSONObject pwdParams){
    User user = userDao.getUserByUsername(pwdParams.getString("username"));
    if(user!=null&&user.getMobile().equals(pwdParams.getString("mobile"))){
      user.setPassword("");
      //更新用户信息
    }
  }


}
