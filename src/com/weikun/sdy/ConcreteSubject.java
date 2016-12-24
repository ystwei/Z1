package com.weikun.sdy;

/**
 * Created by Administrator on 2016/12/24.
 */
public class ConcreteSubject implements Subject {
    @Override
    public void say() {
        System.out.println("me  say");
    }

    @Override
    public void print() {
        System.out.println("me  print");
    }
}
