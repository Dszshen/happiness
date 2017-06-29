package com.uuit.happiness.mongo.bean;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

/**
 * Created by zhangbin on 2017/6/29 0029.
 * 照片墙bean
 */
@Document
public class Wall {

    @Id
    private String id;
    private String imgUrl;
    private String description;
}
