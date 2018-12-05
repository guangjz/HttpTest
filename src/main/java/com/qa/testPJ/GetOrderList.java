package com.qa.testPJ;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.message.BasicNameValuePair;

import java.util.*;

/**
 * Created by guangjiazheng on 2018/11/30.
 */
public class GetOrderList {

    final public static String URL = "http://10.12.2.27:8080/api/manage/banner/getList";
    final public static String Authorization = "URL0cbe1324ef9f3324d30026a4e57386f1";

    public static  void testone() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Authorization","0cbe1324ef9f3324d30026a4e57386f1");

        Map<String, String> maplist = new HashMap<String, String>();
        List<String> list = new ArrayList<String>();
//        maplist.put("Authorization","0cbe1324ef9f3324d30026a4e57386f1");
//        maplist.put("status", Integer.toString(1));
//        maplist.put("pageNo", Integer.toString(1));
//        maplist.put("pageSize",Integer.toString(10));
//        maplist.put("pageSize", "10");

        for (String key : maplist.keySet()) {
            list.add(key);
            //  System.out.println(key);
        }
        Collections.sort(list);
        String listpara = GetOrderList.Authorization;
        for (String tmp : list) {
            listpara = listpara + tmp;
            listpara = listpara + maplist.get(tmp);
            //System.out.println(listpara);
        }
        String signstr = httpsend.SHA1(listpara).toLowerCase();
        //System.out.println(signstr);
        maplist.put("sign", signstr);

        List params = new ArrayList();
        for (String key : maplist.keySet()) {
            params.add(new BasicNameValuePair(key, maplist.get(key)));
        }
//        JSONObject jsonObject = JSONObject.fromObject(restr);
//        int code = jsonObject.getInt("code");

        String restr = httpsend.doHttpPost(GetOrderList.URL, jsonObject);

        System.out.println(restr);

        System.out.println(list);

    }

    public static void main(String[] args){

        GetOrderList.testone();


    }


}
