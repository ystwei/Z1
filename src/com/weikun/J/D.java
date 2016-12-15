package com.weikun.J;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * Created by Administrator on 2016/12/15.
 */
public class D {
    @Test
    public void test(){
        try {
            ExecutorService es= Executors.newCachedThreadPool();
            for(int i=0;i<10;i++){
                Future<String> f=es.submit(new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        return Thread.currentThread().getName();
                    }
                });
                System.out.println(f.get());
            }

            es.shutdown();;

            es.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
