package com.weikun.K;

import org.junit.Test;

import java.util.List;

/**
 * Created by Administrator on 2016/12/15.
 * 测试内存板的购物车：同一种商品，仅需累加数量，
 * 除非是新商品，才能做放购物车内。
 */
public class TestCart {


    @Test
    public  void test(){
        buy(new Goods("1001","牛奶",1,2));
        buy(new Goods("1001","牛奶",1,3));
        buy(new Goods("1002","奶牛",2,2));
        buy(new Goods("1003","咖啡",3,3));

        float sum=0;
        for(Goods goods:cart){
            sum+=goods.getPrice()*goods.getQuantity();
            System.out.println("商品是："+goods.getName()+"合计是："+goods.getPrice()*goods.getQuantity());
        }
        System.out.println("你这次消费是："+sum);
    }
    /**
     *
     * @param newGoods:新商品
     * @return 购物车
     */
    private List<Goods> cart=new Cart().getList();//购物车
    public void buy(Goods newGood){
        boolean flag=false;//新商品

        for(int i=0;i<cart.size();i++){
            Goods oldGood=cart.get(i);//老商品
            if(oldGood.getNo().equals(newGood.getNo())){//已经有该商品，
                oldGood.setQuantity(oldGood.getQuantity()+newGood.getQuantity());//更改数量
                flag=true;
                break;
            }

        }
        if(!flag){//新商品
            cart.add(newGood);
        }


    }
}
