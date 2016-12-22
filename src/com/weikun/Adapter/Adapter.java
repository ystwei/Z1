package com.weikun.Adapter;

/**
 * Created by Administrator on 2016/12/22.
 */
public class Adapter  implements Telphone { //extends Chazuo
    Chazuo c=new Chazuo();
    @Override
    public void call() {
        c.chongdian();
    }
}
