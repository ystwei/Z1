package com.weikun.sdy;



/**
 * Created by Administrator on 2016/12/24.
 */
public class Test {
    public static void main(String[] args) {
        ConcreteSubject subject =new ConcreteSubject();
        Proxy p=new Proxy(subject);
        p.say();
        p.print();
    }
}
