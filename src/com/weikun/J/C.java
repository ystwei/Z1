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
        //ExecutorService es= Executors.newFixedThreadPool(8);//开固定线程
       //ExecutorService es= Executors.newSingleThreadExecutor();//开单一线程
        ExecutorService es= Executors.newCachedThreadPool();//开不定数量的线程
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
            System.out.println("关闭成功!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
