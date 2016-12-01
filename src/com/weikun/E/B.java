package com.weikun.E;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/12/1.
 */
public class B {
    public static void main(String[] args) {
        System.out.println((int)'猪');
        System.out.println((int)'猫');
        Animal a[]={
                new Animal(12,"猪","zhu"),
                new Animal(12,"猫","mao"),
                new Animal(10,"狗","gou")
        };
//        int []a1={1,3,4,2,5};//一般数组
//
        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a,new Animal(12,"猫","mao")));
//        for( Animal i :a){
//            System.out.println(i.getName());
//        }
       // Arrays.sort(a);
    }
}
