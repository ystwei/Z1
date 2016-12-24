package com.weikun.AbstractFactory;



/**
 * Created by Administrator on 2016/12/24.
 */
public class Test {
    public static void main(String[] args) {
        IFactory a=new FactroyA();
        a.makeA().go();
        IFactory b=new FactroyA();
        b.makeB().run();

    }
}
