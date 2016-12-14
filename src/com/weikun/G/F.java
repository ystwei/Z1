package com.weikun.G;

/**
 * Created by Administrator on 2016/12/14.
 */
public class F {
    public static void main(String[] args) {
        F0 f0=new F0();
        f0.setName("F0");
        f0.start();

        F1 f1=new F1();
        f1.setDaemon(true);
        f1.setName("F1");
        f1.start();
    }
}

class F1 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() .getName()+":"+i);
        }
    }
}

class F0 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() .getName()+":"+i);
        }
    }
}