package com.weikun.dy2;

/**
 * Created by Administrator on 2016/12/24.
 */
public class Cat extends IAnimal {
    @Override
    public void go() {
        System.out.println("CAT--GO");
    }

    @Override
    public void say() {
        System.out.println("CAT--SAY");
    }

    @Override
    public void run() {
        System.out.println("CAT--run");
    }
}
