package com.weikun.G;

/**
 * Created by Administrator on 2016/12/14.
 */
public class A {

    public static void main(String[] args) {
        A1 a1=new A1();
        a1.setName("A1");
        a1.start();

        A1 a2=new A1();
        a2.setName("A2");
        a2.start();
    }
}
class A1 extends Thread{//���߳���
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);//this.getName()
        }
    }
}
