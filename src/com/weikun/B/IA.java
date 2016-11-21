package com.weikun.B;

/**
 * Created by Administrator on 2016/11/21.
 */
public interface IA extends IB,IC{
   public abstract  void go();
}
interface IB{
    void mark();
}
interface  IC {
    int age=200;
    void plan();
}
class D implements  IC{
    void bark(){

    }

    @Override
    public void plan() {

    }
}
class C extends  D implements IA {

    @Override
    public void go() {

    }

    @Override
    public void mark() {

    }

    @Override
    public void plan() {

    }
}