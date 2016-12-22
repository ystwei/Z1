package com.weikun.Singleton;

/**
 * Created by Administrator on 2016/12/22.
 */
public class Test {
    public static void main(String[] args) {
//        A a=A.getInstance();
//        A a1=A.getInstance();
//        System.out.println(a);
//        System.out.println(a1);


        B b=B.getInstance();
        B b1=B.getInstance();

        System.out.println(b);
        System.out.println(b1);
    }
}
