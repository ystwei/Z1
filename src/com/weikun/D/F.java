package com.weikun.D;

/**
 * Created by Administrator on 2016/11/28.
 */
public class F {
    public static void main(String[] args) {
        Animal a=new Animal(10,"狗");
        Animal a1=new Dog(10,"狗");
        System.out.println(a.equals(a1));

    }
}
class Animal{
    private int age;
    private String name;

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

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {//obj被比对象 this：比较对象
        if(this==obj){//咱两堆一样，
            return true;
        }
        if(obj==null){//Obj为空，能比吗？
            return false;
        }
        if(this.getClass()!=obj.getClass()){//不是同一个种族
            return false;
        }
        Animal a=(Animal)obj;


        return this.age-a.age==0 && this.name.compareTo(a.name)==0;
    }
}
class Dog extends Animal{

    public Dog(int age, String name) {
        super(age,name);

    }
}
