package com.weikun.FactoryMethod;

/**
 * Created by Administrator on 2016/12/24.
 */
public class Test {
    public static void main(String[] args) {
        IFactory k=new KFC();
        k.makeHanbao().byEat();


        IFactory m=new MOC();
        m.makeHanbao().byEat();
    }
}
