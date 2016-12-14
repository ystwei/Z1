package com.weikun.G;

import java.util.Timer;

/**
 * Created by Administrator on 2016/12/14.
 */
public class Test {
    public static void main(String[] args) {
        Timer timer=new Timer();
        int imgCount=10;
        G g=new G(timer,imgCount);

        timer.schedule(g,0,1);
    }

}
