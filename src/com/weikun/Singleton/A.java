package com.weikun.Singleton;

/**
 * Created by Administrator on 2016/12/22.
 */
public class A {
    private A(){//1私有构造器

    }
    private volatile static A a;//2声明个静态的自己,volatile:在JVM层进行锁定对象
    public static A getInstance(){//3.得到自己的地址
        synchronized(A.class){

            if(a==null){
                a=new A();
            }
        }

        return a;
    }

}
