package com.weikun.decorator;

/**
 * Created by Administrator on 2016/12/22.
 */
public class ArtGirl  extends GirlDecorator {
    private Girl girl;
    public ArtGirl(Girl girl){
        this.girl=girl;
    }
    @Override
    public String getDesc() {
        return this.girl.getDesc()+"+œ≤ª∂“’ ı";
    }
}
