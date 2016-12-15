package com.weikun.J;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2016/12/15.
 */
public class C {
    public static void main(String[] args) {
        //ExecutorService es= Executors.newFixedThreadPool(8);//���̶��߳�
       //ExecutorService es= Executors.newSingleThreadExecutor();//����һ�߳�
        ExecutorService es= Executors.newCachedThreadPool();//�������������߳�
        for(int i=0;i<100;i++){
            es.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+":");
                }
            });
        }

        es.shutdown();
        try {
            es.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
            System.out.println("�رճɹ�!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
