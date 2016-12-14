package com.weikun.G;

/**
 * Created by Administrator on 2016/12/14.
 */
public class E {
    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
            if(i==100){
                E1 e=new E1();
                e.setName("E1");
                e.start();
                try {
                    e.join();//加入线程
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                E1 e2=new E1();
                e2.setName("E2");
                e2.start();
                try {
                    e2.join();//加入线程
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread() .getName()+":"+i);//this.getName()
        }



    }
}
class E1 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<1000;i++){

            System.out.println(Thread.currentThread() .getName()+":"+i);//this.getName()
        }
    }
}