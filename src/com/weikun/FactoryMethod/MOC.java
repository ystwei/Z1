package com.weikun.FactoryMethod;

/**
 * Created by Administrator on 2016/12/24.
 */
public class MOC implements IFactory {
    @Override
    public IHanbao makeHanbao() {
        return new MOCHanbao();
    }
}
