package com.uuit.happiness.service.wall;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangbin on 2017/6/28 0028.
 */
@Service("wallService")
public class WallService {

    public List<JSONObject> wall(){
        List<JSONObject> list=new ArrayList<JSONObject>();

        for (int i=1;i<=34;i++) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("imgUrl","url");
            jsonObject.put("title","萌宠"+i);
            jsonObject.put("desc","描述"+i);
            list.add(jsonObject);
        }

        return list;
    }

}
