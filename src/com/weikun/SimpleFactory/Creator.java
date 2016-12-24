package com.weikun.SimpleFactory;

/**
 * Created by Administrator on 2016/12/24.
 */
public class Creator {
    public IProduct diancan(int i){
        switch (i){
            case 1:
                return new ProductA();
            case 2:
                return new ProductB();

            default:
                return null;
        }


    }
}
