package com.weikun.B;

/**
 * Created by Administrator on 2016/11/21.
 */
public class E extends E0{
    public static void main(String[] args) {
        E0 e=new E();//编译类型=运行类型 虚方法调用---向上转型，
        e.go();//按运行时类型执行。
        ((E)e).mark();
    }





    void go(){
        System.out.println("2");
    }
    void mark(){
        System.out.println("3");
    }
}
class E0{

    void go(){
        System.out.println("1");
    }
}
