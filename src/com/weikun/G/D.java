package com.weikun.G;

/**
 * Created by Administrator on 2016/12/14.
 */
public class D {
    public static void main(String[] args) {
        D1 d1=new D1();
        d1.setName("D1");
      //  d1.setPriority(4);//10
        d1.start();

        D1 d2=new D1();
        d2.setName("D2");
     //   d2.setPriority(6);//1
        d2.start();
    }

}
class D1 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
           // if(i==50){
                //Thread.currentThread().stop();
                try {
                    this.yield();
                    Thread.currentThread().sleep(10);

                    System.out.println(Thread.currentThread() .getName()+":"+i);//this.getName()
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            //}

        }
    }
}
