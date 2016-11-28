package com.weikun.D;

import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2016/11/28.
 */
public class D {

    public static void main(String[] args) {
//        char c[]={'A','B','C'};
//        String s=new String(c);
//        System.out.println(c);
//        Integer i0=100;
//        i0.doubleValue()
//        int i=Integer.parseInt("9");
//
//        System.out.println(i);


        int i=100;
        String s1=String.valueOf(i);
        //GB2312<GBK<GB18030<UTF-8(unicode)<UTF-16
        //BIG5
        try {
            String str1 = new String("我爱你".getBytes("ISO8859-1"), "gb2312");

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

//        double d=Double.parseDouble("9.1");
//        System.out.println(d);
    }

}
