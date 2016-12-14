package com.weikun.I;

/**
 * Created by Administrator on 2016/12/14.
 * 线程通信
 */
public class Account {

    private String accountNo;
    private int balance;

    public Account(String accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //false:没有存款，可以存了，不能取，
    //true:有存款，可以取了，不能存
    private boolean flag = false;

    public void getMoney(int money) {//只能取钱线程调用
        synchronized (this) {
            if (flag == false) {

                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {//可以取了

                this.setBalance(this.getBalance() - money);//取走了
                System.out.println("取了" + money);
                flag = false;
                notifyAll();

            }
        }

    }

    public void saveMoney(int money) {////只能存钱线程调用
        synchronized (this) {
            if (flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else {//存钱过程

                this.setBalance(this.getBalance() + money);//存了

                System.out.println("存了" + money);
                flag = true;
                notifyAll();
            }
        }

    }
}
