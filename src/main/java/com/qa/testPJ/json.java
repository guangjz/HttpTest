package com.qa.testPJ;

import net.sf.json.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

/**
 * Created by guangjiazheng on 2018/12/5.
 */
public class json {
    public static void main(String[] args) throws Exception{

    DefaultHttpClient httpClient = new DefaultHttpClient();
    String url = "http://120.27.13.239:8081/dmp/terminalNorthApi/device";
    HttpPost httpPost = new HttpPost(url);

    // 设置请求的header
    httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

    // 设置请求的参数
    JSONObject jsonParam = new JSONObject();
        jsonParam.put("deviceName", "哈哈");

        jsonParam.put("productId", "57700000152");


        StringEntity entity = new StringEntity(jsonParam.toString(), "utf-8");
    entity.setContentEncoding("UTF-8");
    entity.setContentType("application/json");
    httpPost.setEntity(entity);

    // 执行请求
    HttpResponse response = httpClient.execute(httpPost);
    String json2 = EntityUtils.toString(response.getEntity(), "utf-8");
    JSONObject jsonObject = JSONObject.fromObject(json2);

    // 打印执行结果
    System.out.println(jsonObject);
    }



}