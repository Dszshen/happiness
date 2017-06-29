package com.uuit.happiness.mongo.dao;

import com.uuit.happiness.mongo.bean.Wall;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zhangbin on 2016/6/14.
 */
@Repository
public interface WallDao extends MongoRepository<Wall,String>{

}
