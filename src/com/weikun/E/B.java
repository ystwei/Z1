package com.weikun.E;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/12/1.
 */
public class B {
    public static void main(String[] args) {
        System.out.println((int)'��');
        System.out.println((int)'è');
        Animal a[]={
                new Animal(12,"��","zhu"),
                new Animal(12,"è","mao"),
                new Animal(10,"��","gou")
        };
//        int []a1={1,3,4,2,5};//һ������
//
        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a,new Animal(12,"è","mao")));
//        for( Animal i :a){
//            System.out.println(i.getName());
//        }
      // Arrays.sort(a);

    }
}
