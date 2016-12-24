package com.weikun.sdy;

/**
 * Created by Administrator on 2016/12/24.
 */
public class Proxy implements Subject {
    public Subject subject;
    public  Proxy(Subject subject){
        this.subject=subject;
    }
    @Override
    public void say() {
        System.out.println("My Proxy");
        this.subject.say();
    }

    @Override
    public void print() {
        System.out.println("My Proxy");
        this.subject.print();

    }
}
