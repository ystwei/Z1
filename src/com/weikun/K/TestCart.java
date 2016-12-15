package com.weikun.K;

import org.junit.Test;

import java.util.List;

/**
 * Created by Administrator on 2016/12/15.
 * �����ڴ��Ĺ��ﳵ��ͬһ����Ʒ�������ۼ�������
 * ����������Ʒ���������Ź��ﳵ�ڡ�
 */
public class TestCart {


    @Test
    public  void test(){
        buy(new Goods("1001","ţ��",1,2));
        buy(new Goods("1001","ţ��",1,3));
        buy(new Goods("1002","��ţ",2,2));
        buy(new Goods("1003","����",3,3));

        float sum=0;
        for(Goods goods:cart){
            sum+=goods.getPrice()*goods.getQuantity();
            System.out.println("��Ʒ�ǣ�"+goods.getName()+"�ϼ��ǣ�"+goods.getPrice()*goods.getQuantity());
        }
        System.out.println("����������ǣ�"+sum);
    }
    /**
     *
     * @param newGoods:����Ʒ
     * @return ���ﳵ
     */
    private List<Goods> cart=new Cart().getList();//���ﳵ
    public void buy(Goods newGood){
        boolean flag=false;//����Ʒ

        for(int i=0;i<cart.size();i++){
            Goods oldGood=cart.get(i);//����Ʒ
            if(oldGood.getNo().equals(newGood.getNo())){//�Ѿ��и���Ʒ��
                oldGood.setQuantity(oldGood.getQuantity()+newGood.getQuantity());//��������
                flag=true;
                break;
            }

        }
        if(!flag){//����Ʒ
            cart.add(newGood);
        }


    }
}
