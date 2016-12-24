package com.weikun.dy2;

/**
 * Created by Administrator on 2016/12/24.
 */
public class Test {
    public static void main(String[] args) {

        MyProxy my=new MyProxy();
        Cat c1=(Cat)my.getObject(Cat.class);
        c1.go();

        c1.say();
    }
}
