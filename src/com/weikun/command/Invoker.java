package com.weikun.command;

/**
 * Created by Administrator on 2016/12/24.
 */
public class Invoker {
    public void plan(Command command){

        command.go();
    }
}
