package com.qa.testPJ;

import net.sf.json.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

/**
 * Created by guangjiazheng on 2018/12/5.
 */
public class TopMsgList {

    @Test

    public static  void TopMsgListCase() throws Exception{

        DefaultHttpClient httpClient = new DefaultHttpClient();
    String url = "http://112.35.62.21:8088/api/home/queryMenu";
    HttpPost httpPost = new HttpPost(url);

    // 设置请求的header
    httpPost.addHeader("Authorization", "application/json;charset=utf-8");

    // 设置请求的参数
    JSONObject jsonParam = new JSONObject();
//        jsonParam.put("token","15dcb5581a2fb8919c0c1c86a08da883");
    jsonParam.put("userId", "100093");

    jsonParam.put("count", "5");


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
