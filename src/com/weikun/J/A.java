package com.weikun.J;

/**
 * Created by Administrator on 2016/12/15.
 * 线程组
 */
public class A {
    public static void main(String[] args) {


        B b=new B();


    }
}
class B extends Thread{

    public B(){
        ThreadGroup a=new ThreadGroup("父亲");
        Thread t=new Thread(a,this);
        t.setName("A");
        t.start();
        Thread t1=new Thread(a,this);
        t1.setName("B");
        t1.start();

        int count=a.activeCount();
        Thread[] ts=new Thread[count];
        //返回真正有效的线程个数
        int j=a.enumerate(ts);//线程组将把有效地线程放入数组中，
        for(int i=0;i<j;i++){
            System.out.println(ts[i].getName());
        }


    }

    @Override
    public void run() {
        for(int i=0;i<100;i++){

            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
