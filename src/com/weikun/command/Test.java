package com.weikun.command;

/**
 * Created by Administrator on 2016/12/24.
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver=new Receiver();
        Invoker invoker=new Invoker();
        Command cmd=new ConcreteCommand(receiver);
        invoker.plan(cmd);
    }
}
