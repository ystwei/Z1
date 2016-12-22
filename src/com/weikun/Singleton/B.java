package com.weikun.Singleton;

/**
 * Created by Administrator on 2016/12/22.
 */
public class B {
    private static class B1{
        public static B b=new B();

    }
    private B(){

    }
    public static B getInstance(){
        return B1.b;
    }
}
