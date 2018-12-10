package com.qa.testPJ;

/**
 * Created by guangjiazheng on 2018/12/6.
 */
public class MitiThread implements Runnable {
//    MySqlTest xx = new MySqlTest();

    public MitiThread() {
    }

    public void run() {
        try {
            json.httpPost();
        } catch (Exception var2) {

            var2.printStackTrace();
        }

    }

    public static void main(String[] args) throws Throwable {
        MitiThread test = new MitiThread();
        Thread thread [] = new Thread [600];

        for(int i=0;i<200;i++){

            thread[i]=new Thread(test);

            thread[i].start();
        }
    }
}
