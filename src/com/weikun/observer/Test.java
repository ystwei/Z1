package com.weikun.observer;

/**
 * Created by Administrator on 2016/12/22.
 */
public class Test {

    public static void main(String[] args) {
        ConcreteSubject subject=new ConcreteSubject();
        subject.setState("∫ÕAlice∏„∂‘œÛ£°");
        Observer mike=new ConcreteObserver(subject,"MIKE");

        Observer jack=new ConcreteObserver(subject,"Jack");

        Observer joe=new ConcreteObserver(subject,"Joe");
        subject.attachO(mike);
        subject.attachO(jack);
        subject.attachO(joe);
        subject.dettachO(jack);
        subject.Notify();




    }
}
