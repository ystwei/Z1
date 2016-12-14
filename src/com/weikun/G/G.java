package com.weikun.G;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2016/12/14.
 */
public class G extends TimerTask{
    private int imgId;//图片序号，
    private int imgCount;//图片总数
    private Timer timer;//计数器
    public G(Timer timer,int imgCount){
        this.timer=timer;
        this.imgCount=imgCount;
    }
    @Override
    public void run() {
        if(++imgId<=imgCount){//游戏没加载完毕

            System.out.println("游戏加载到第"+imgId+"张图片");
        }else{
            System.out.println("进入游戏!");
            timer.cancel();//让计数器停止
        }
    }
}
