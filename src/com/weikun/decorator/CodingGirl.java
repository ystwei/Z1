package com.weikun.decorator;

/**
 * Created by Administrator on 2016/12/22.
 */
public class CodingGirl extends GirlDecorator {
    private Girl girl;
    public CodingGirl(Girl girl){
        this.girl=girl;
    }
    @Override
    public String getDesc() {
        return this.girl.getDesc()+"+Ï²»¶±àÂë";
    }
}
