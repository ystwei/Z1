package com.weikun.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/22.
 */
public abstract class Subject {

    public List<Observer> list=new ArrayList<Observer>();

    public void attachO(Observer observer){//进群
        list.add(observer);
    }

    public void dettachO(Observer observer){//剔除了
        list.remove(observer);
    }

    //发消息,唤醒 notify
    public void Notify(){

        for(Observer os :list){
            os.update();
        }
    }


}
