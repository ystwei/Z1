package com.weikun.E;

/**
 * Created by Administrator on 2016/12/1.
 */
public class H {
    public static void main(String[] args) {
        new H().go();
    }
    void go(){
        int old=200;
        if(old>18){
            try {
                throw new MyException1(old);
            } catch (MyException1 myException1) {
                System.out.print(myException1);
            }
        }else if(old<18){
            try {
                throw new MyException2(old);
            } catch (MyException2 myException2) {
                System.out.print(myException2);
            }
        }else{
            System.out.println("�����㿴���ǵ���վ��");
        }
    }
}
class MyException1 extends Exception{
    private int old;
    public MyException1(int old){
        this.old=old;
    }
    @Override
    public String toString() {
        return this.old+"��"+"�Һ���";
    }
}

class MyException2 extends Exception{
    private int old;
    public MyException2(int old){
        this.old=old;
    }
    @Override
    public String toString() {
        return this.old+"��"+"�Һ�����";
    }
}
