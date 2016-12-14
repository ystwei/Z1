package com.weikun.H;

/**
 * Created by Administrator on 2016/12/14.
 */
public class Account {
    private String no;//ук╨е
    private int money;
    public Account(){

    }

    public Account(String no, int money) {

        this.no = no;
        this.money = money;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
