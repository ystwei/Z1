package com.weikun.G;

/**
 * Created by Administrator on 2016/12/14.
 */
public class B {
    public static void main(String[] args) {
        B1 b1=new B1();
        Thread t1=new Thread(b1);
        t1.setName("B1");
        t1.start();

        B1 b2=new B1();
        Thread t2=new Thread(b2);
        t2.setName("B2");
        t2.start();
    }
}
class B1 implements  Runnable{


    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);//this.getName()
        }
    }
}