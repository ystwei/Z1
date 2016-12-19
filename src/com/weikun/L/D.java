package com.weikun.L;

import java.util.regex.Pattern;

/**
 * Created by Administrator on 2016/12/19.
 */
public class D {
    public static void main(String[] args) {
        //任意合法的两位小数,含整数 99.1
        //一年的12个月 1--9 01 02 1 2
        // System.out.println(Pattern.matches("^[0-9]*(\\.[0-9]{2,})?$","999.1"));
        // System.out.println(Pattern.matches("^0[1-9]|[1-9]|10|11|12$","13"));
        //System.out.println(Pattern.matches("^C\\wT$","CAAT"));
        //System.out.println(Pattern.matches("^[^abc谷]$","谷"));


        // TODO Auto-generated method stub
        // \w:匹配所有单词字符，包括0-9所有数字，26个英文字母和下划线(_)
        //*:指定前面子表达式可以出现零次或多次，
        String str="Hello,Java";
        //贪婪模式的正则:数量表示符(*)会一种匹配下去，所以该字符串前面所有单词字符都被它匹配到，直到遇到空格
        System.out.println(str.replaceFirst("\\w+", "■"));//■,Java
        System.out.println(str.replaceAll("\\w+", "■"));
        //勉强模式的正则：数量表示符(*)会尽量匹配最少字符，即匹配0个字符。
        System.out.println(str.replaceFirst("\\w+?", "■"));//■ello,Java
        System.out.println(str.replaceAll("\\w+?", "■"));//■ello,Java
    }
}
