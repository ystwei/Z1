package com.weikun.observer;

/**
 * Created by Administrator on 2016/12/22.
 */
public class ConcreteObserver extends Observer {
    private String name;
    private ConcreteSubject subject;
    public ConcreteObserver(ConcreteSubject subject,String name){
        this.subject=subject;
        this.name=name;
    }
    @Override
    public void update() {

        System.out.println(this.name+"£¬ËýÔÚ"+this.subject.getState());

    }
}
