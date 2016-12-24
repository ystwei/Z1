package com.weikun.dy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2016/12/24.
 */
public class Test {
    public static void main(String[] args) {
        IAnimal c=new Cat();

        InvocationHandler my=new MyProxy(c);

        Object o=Proxy.newProxyInstance(
                c.getClass().getClassLoader()
                ,
                c.getClass().getInterfaces()
                ,my);
        ((IAnimal)o).go();
        ((IAnimal)o).say();
        ((IAnimal)o).run();
    }
}
