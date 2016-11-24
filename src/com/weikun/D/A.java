package com.weikun.D;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Administrator on 2016/11/24.
 */
public class A {
    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date d=new Date();
//        d.setYear(999);
//        System.out.print(sdf.format(d));

        Calendar c=Calendar.getInstance();
        c.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        System.out.print(c.get(Calendar.YEAR));
        System.out.print(c.get(Calendar.MONTH)+1);
        System.out.print(c.get(Calendar.DAY_OF_MONTH));

        System.out.print(c.get(Calendar.HOUR_OF_DAY));

        System.out.print(c.get(Calendar.MINUTE));

        System.out.print(c.get(Calendar.SECOND));

    }
}
