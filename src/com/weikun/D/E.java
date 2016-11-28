package com.weikun.D;

/**
 * Created by Administrator on 2016/11/28.
 */
public class E {
    public static void main(String[] args) {
//        int i=100;
//        int j=200;
//        System.out.print(i==j);
//        String s = "ABC";
//        String s1 = new String("abc");//强制开堆。
//        System.out.print(s == s1);
//        System.out.print(s.equals(s1));//比较其堆中的内容是否相等。
//        System.out.print(s.equalsIgnoreCase(s1));//比较其堆中的内容是否相等。

        //System.out.print("abc".compareTo("ABDE"));
        //System.out.println("abcdefg".startsWith("abcd"));
        //System.out.println("abcdefg".endsWith("ab"));
        //System.out.println("abcaacaa".indexOf("a",2));
       // System.out.println("abcadce".lastIndexOf("",1));
        //System.out.println(" A C ".trim()+"B");
        //System.out.println("我爱你们吗？".substring(2,4));
        String ss[]="a=b%c".split("=");//$正则的结束 ^正则开始
        System.out.println(ss[0]+"--"+ss[1].split("%")[0]+"--"+ss[1].split("%")[1]);

    }
}
