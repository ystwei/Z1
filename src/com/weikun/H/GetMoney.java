package com.weikun.H;

/**
 * Created by Administrator on 2016/12/14.
 */
public class GetMoney extends Thread{
    private Account account;
    private int money;
    public GetMoney(String name,Account acc,int money){
        super(name);
        this.account=acc;
        this.money=money;
    }
    @Override
    public   void run() {
        synchronized(account){
            if(this.account.getMoney()>=this.money){//�����ǰ�˻�����������ҪȡǮ����Ŀ������ȡǮ
                System.out.println(this.getName()+"ȡ��"+this.money+"Ǯ");
                this.account.setMoney(this.account.getMoney()-this.money);

            }else{//ȡ��Ǯ������������ȡ
                System.out.println("����ȡǮ������");
            }
        }



    }
}
