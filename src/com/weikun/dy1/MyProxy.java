package com.weikun.dy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/12/24.
 */
public class MyProxy implements InvocationHandler {
    private Object o;
    public MyProxy(Object o){
        this.o=o;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            System.out.println("�ҵĴ���֮ǰִ��");

            return   method.invoke(o,args);//���ú���ʵ���෽����;
        } catch (IllegalAccessException e) {
            return null;

        } finally {
            System.out.println("�ҵĴ���֮��ִ��");
        }



    }
}
