package com.weikun.H;

/**
 * Created by Administrator on 2016/12/14.
 */
public class Test {
    public static void main(String[] args) {
        Account a=new Account("123",800);
        new GetMoney("����",a,800).start();
        new GetMoney("����",a,800).start();
    }
}
