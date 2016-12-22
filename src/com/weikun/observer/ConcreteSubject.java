package com.weikun.observer;

/**
 * Created by Administrator on 2016/12/22.
 */
public class ConcreteSubject extends Subject{
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
