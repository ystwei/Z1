package com.weikun.A;

/**
 * Created by Administrator on 2016/11/17.
 */
public class B extends B0{
    B(){
        System.out.println("1");
    }
    {
        System.out.println("2");
    }
    static{
        System.out.println("3");
    }
    static{
        System.out.println("7");
    }
    public static void main(String[] args) {
        System.out.print(new B());
    }
}
class B0{
    static{
        System.out.println("4");
    }
    static{
        System.out.println("6");
    }
    {
        System.out.println("5");
    }
}