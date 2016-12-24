package com.weikun.AbstractFactory;

import com.weikun.FactoryMethod.*;

/**
 * Created by Administrator on 2016/12/24.
 */
public class FactroyA implements IFactory {
    @Override
    public AbstractProductA makeA() {
        return new ProductA();
    }

    @Override
    public AbstractProductB makeB() {
        return new ProductB();
    }
}
