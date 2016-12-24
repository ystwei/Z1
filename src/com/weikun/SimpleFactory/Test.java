package com.weikun.SimpleFactory;

/**
 * Created by Administrator on 2016/12/24.
 */
public class Test {
    public static void main(String[] args) {
        Creator c=new Creator();
        c.diancan(1).saleProduct();
        c.diancan(2).saleProduct();
    }
}
