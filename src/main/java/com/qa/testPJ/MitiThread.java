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
        Thread thread1 = new Thread(test);
        Thread thread2 = new Thread(test);
        Thread thread3 = new Thread(test);
        Thread thread4 = new Thread(test);
        Thread thread5 = new Thread(test);
        Thread thread6 = new Thread(test);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
    }
}
