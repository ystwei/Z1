package com.weikun.E;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/12/1.
 */
public class B {
    public static void main(String[] args) {
        System.out.println((int)'Öí');
        System.out.println((int)'Ã¨');
        Animal a[]={
                new Animal(12,"Öí","zhu"),
                new Animal(12,"Ã¨","mao"),
                new Animal(10,"¹·","gou")
        };
//        int []a1={1,3,4,2,5};//Ò»°ãÊý×é
//
        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a,new Animal(12,"Ã¨","mao")));
//        for( Animal i :a){
//            System.out.println(i.getName());
//        }
      // Arrays.sort(a);

    }
}
