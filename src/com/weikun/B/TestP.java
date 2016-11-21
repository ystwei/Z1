package com.weikun.B;

/**
 * Created by Administrator on 2016/11/21.
 */
public class TestP {
    public static void main(String[] args) {
        TestP p=new TestP();
       // p.mark(new People1());
        //p.mark(new People2());
        p.plan(1).go();
        p.plan(2).go();
    }
    void mark(People p1){
        p1.go();
    }
    People plan(int i){
       switch (i){
           case 1:
               return new People1();
           case 2:
               return new People2();
       }
        return null;
    }
}
class People{
    void go(){
        System.out.print("0");
    }
}
class People1 extends People{
    void go(){
        System.out.print("1");
    }
}
class People2 extends People{
    void go(){
        System.out.print("2");
    }
}