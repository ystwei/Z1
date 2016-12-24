package com.weikun.dy2;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/12/24.
 */
public class MyProxy implements MethodInterceptor {

    public Object getObject(Class obj){
        Enhancer en=new Enhancer();
        en.setSuperclass(obj);
        en.setCallback(this);

        return en.create();

    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("before");
        methodProxy.invokeSuper(o,objects);
        System.out.println("after");
        return null;
    }
}
