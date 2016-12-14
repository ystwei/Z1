package com.weikun.I;

/**
 * Created by Administrator on 2016/12/14.
 * �߳�ͨ��
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

    //false:û�д����Դ��ˣ�����ȡ��
    //true:�д�����ȡ�ˣ����ܴ�
    private boolean flag = false;

    public void getMoney(int money) {//ֻ��ȡǮ�̵߳���
        synchronized (this) {
            if (flag == false) {

                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {//����ȡ��

                this.setBalance(this.getBalance() - money);//ȡ����
                System.out.println("ȡ��" + money);
                flag = false;
                notifyAll();

            }
        }

    }

    public void saveMoney(int money) {////ֻ�ܴ�Ǯ�̵߳���
        synchronized (this) {
            if (flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else {//��Ǯ����

                this.setBalance(this.getBalance() + money);//����

                System.out.println("����" + money);
                flag = true;
                notifyAll();
            }
        }

    }
}
