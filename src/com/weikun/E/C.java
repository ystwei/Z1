package com.weikun.E;

/**
 * Created by Administrator on 2016/12/1.
 */
public class C {
    public static void main(String[] args) {
        Professor pro=new Professor("男");
        People p=new People(10,"MIKE",pro);
        System.out.print(p.getPro().getSex());
        People p1= null;
        try {

            p1 =(People) p.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //System.out.println(p);//Class@ffaadd
       // p.setName("ROSE");

        System.out.println(p1.getPro().getSex());
        p.getPro().setSex("女");
        System.out.println(p1.getPro().getSex());
    }
}
class Professor implements Cloneable{
    public Professor(String sex) {
        this.sex = sex;
    }

    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class People implements Cloneable{
    private Professor pro;

    public Professor getPro() {
        return pro;
    }

    public void setPro(Professor pro) {
        this.pro = pro;
    }

    public People(){}
    public People(int age, String name,Professor pro) {
        this.age = age;
        this.name = name;
        this.pro=pro;
        this.pro=pro;
    }

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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        People n=(People)super.clone();
        n.pro=(Professor) this.pro.clone();
        return n;
    }
}
