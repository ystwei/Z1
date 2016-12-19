package com.weikun.D;

/**
 * Created by Administrator on 2016/11/28.
 */
public class F {
    public static void main(String[] args) {
        Animal a=new Animal(10,"��");
        Animal a1=new Dog(10,"��");
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
    public boolean equals(Object obj) {//obj���ȶ��� this���Ƚ϶���
        if(this==obj){//������һ����
            return true;
        }
        if(obj==null){//ObjΪ�գ��ܱ���
            return false;
        }
        if(this.getClass()!=obj.getClass()){//����ͬһ������
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
