package com.uuit.happiness.service.wall;

import com.alibaba.fastjson.JSONObject;
import com.uuit.happiness.mongo.dao.WallDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by zhangbin on 2017/6/28 0028.
 * @description 照片墙功能
 */
@Service("wallService")
public class WallService {

    /**
     * 获取照片墙数据
     * @return
     */
    public List<JSONObject> wall(int pageNo, int pageSize){
        List<JSONObject> list=new ArrayList<JSONObject>();
        for (int i=(pageNo-1)*pageSize+1;i<=pageSize*pageNo;i++) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", UUID.randomUUID().toString());
            jsonObject.put("imgUrl","url");
            jsonObject.put("title","萌宠"+i);
            jsonObject.put("desc","描述"+i);
            list.add(jsonObject);
        }
        return list;
    }


    /**
     * 新增照片墙数据
     */
    public void add(){

    }

}
