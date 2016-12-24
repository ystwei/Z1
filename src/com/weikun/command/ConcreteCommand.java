package com.weikun.command;

/**
 * Created by Administrator on 2016/12/24.
 */
public class ConcreteCommand implements  Command{
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver=receiver;
    }
    @Override
    public void go() {
        receiver.mark();
    }
}
