package com.weikun.G;

/**
 * Created by Administrator on 2016/12/14.
 */
public class C {

    public static void main(String[] args) {
        new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    System.out.println(Thread.currentThread().getName()+":"+i);//this.getName()
                }
            }
        }).start();


        new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    System.out.println(Thread.currentThread().getName()+":"+i);//this.getName()
                }
            }
        }).start();

    }
}
