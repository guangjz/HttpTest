package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by guangjiazheng on 2018/11/30.
 */

public class TestBase {

    public Properties prop;

    //写一个构造函数
    public TestBase() {

        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/qa/config/config.properties");
            prop.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main (String[] args){

        System.out.println(System.getProperty("user.dir"));
    }

}