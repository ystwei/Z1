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
            if(this.account.getMoney()>=this.money){//如果当前账户的余额大于你要取钱的数目。可以取钱
                System.out.println(this.getName()+"取了"+this.money+"钱");
                this.account.setMoney(this.account.getMoney()-this.money);

            }else{//取得钱超过了余额，不能取
                System.out.println("不能取钱，余额不足");
            }
        }



    }
}
