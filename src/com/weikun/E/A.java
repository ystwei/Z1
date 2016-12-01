package com.weikun.E;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/12/1.
 */
public class A {
    public static void main(String[] args) {
        // byte short int long
        //float double
        //char
        //boolean

        int []a={1,3,4,2,5};//一般数组
        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a,4));

//        for( int i :a){
//
//            System.out.println(i);
//        }
//        Animal [] a1={//对象数组
//                new Animal(10,"Dog"),
//                new Animal(11,"Cat"),
//                new Animal(12,"Fish"),
//                new Chick()//多态
//        };
//        for(Animal  i :a1){
//
//            System.out.println(i.getAge()+i.getName());
//        }

    }
}
class Animal implements Comparable{
    private int age;
    private String pinyin;
    private String name;
    public Animal(){}
    public Animal(int age, String name,String pinyin) {
        this.age = age;
        this.name = name;
        this.pinyin=pinyin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {//核心比较算法 0 <0 >0
        //this:自己 o:被比对象
        Animal a=(Animal)o;


        return this.age-a.age==0?this.pinyin.compareTo(a.pinyin) : this.age-a.age;
    }
}
class Chick extends Animal{//click

}

