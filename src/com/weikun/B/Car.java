package com.weikun.B;

/**
 * Created by Administrator on 2016/11/21.
 */
public abstract class Car {
    public abstract int getR();//得到半径
    public abstract int getS();//得到转速
    public double getSpeed(){//车速
        return 2*Math.PI*getR()*getS();
    }
}
class Auto extends Car{


    @Override
    public int getR() {
        return 2;
    }

    @Override
    public int getS() {
        return 5;
    }
}
class Audi extends Car{

    @Override
    public int getR() {
        return 6;
    }

    @Override
    public int getS() {
        return 2;
    }
}
