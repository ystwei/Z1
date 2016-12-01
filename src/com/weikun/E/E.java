package com.weikun.E;

import java.util.Date;

/**
 * Created by Administrator on 2016/12/1.
 */
public class E {
    public static void main(String[] args) {
//        Date d=null;
//
//        d.setYear(100);
//        System.out.println(d);
        try {
            System.out.println(1/0);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }


    }
}
