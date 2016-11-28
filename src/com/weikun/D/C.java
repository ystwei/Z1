package com.weikun.D;

/**
 * Created by Administrator on 2016/11/28.
 */
public class C {
    public static void main(String[] args) {
        //String s="123"+"456";
        //String s="123".concat("456").concat("789");

        StringBuilder sb1=new StringBuilder();
        sb1.append("A");
        StringBuffer sb=new StringBuffer();
        sb.append("HelloWorld");
       // sb.delete(1,3);
        sb.insert(2,"OK");
        //sb=sb.reverse();
        //System.out.print(sb.capacity());

        System.out.print(sb);

    }


}
