package com.weikun.C;

/**
 * Created by Administrator on 2016/11/24.
 */
public enum ESeason {
    //有限个对象，public static final ESeason SPRING=new ESeason();
    SPRING,SUMMER,FALL,WINTER;
    void go(){

        switch (this){
            case SPRING:
                System.out.print("春天");
                break;
            case SUMMER:
                System.out.print("夏天");
                break;
            case FALL:
                System.out.print("秋天");
                break;
            case WINTER:
                System.out.print("冬天");
                break;
        }

    }
}
