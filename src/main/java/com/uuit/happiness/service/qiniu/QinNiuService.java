package com.uuit.happiness.service.qiniu;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by zhangbin on 2017/7/10 0010.
 */
@Service("qiniuService")
public class QinNiuService {

    @Value("${qiniu.access_key}")
    private String ACCESS_KEY;
    @Value("${qiniu.secret_key}")
    private String SECRET_KEY;
    @Value("${qiniu.bucket}")
    String bucketname = "imagetest";//要上传的空间
    //zone0:华东节点，zone1：华北节点，zone2：华南节点
    private static UploadManager uploadManager = new UploadManager(new Configuration(Zone.zone0()));

    /**
     * 七牛云存储之文件上传
     * @param filePath
     * @param key
     */
    public void upload(String filePath,String key){
        try {
            //默认不指定key的情况下，以文件内容的hash值作为文件名
            Response response = uploadManager.put(filePath, null, getUpToken());
            //解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            System.out.println(putRet.key);
            System.out.println(putRet.hash);
        } catch (QiniuException e) {
            //e.printStackTrace();
            Response r = e.response;
            // 请求失败时打印的异常的信息
            System.out.println(r.toString());
        }
    }

    /**
     * 七牛云文件删除
     */
    public void delete(){

    }

    /**
     * 七牛云文件下载
     */
    public void download(){


    }

    public String getUpToken(){
        //密钥配置
        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
        return auth.uploadToken(bucketname);
    }

    public UploadManager getUploadManager(){
        return uploadManager;
    }

}
