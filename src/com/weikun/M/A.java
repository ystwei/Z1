package com.weikun.M;

import org.junit.Test;
import org.weikun.Animal;

import java.lang.reflect.*;

/**
 * Created by Administrator on 2016/12/22.
 */
public class A {
    private static String s="org.weikun.Animal";
    public static void main(String[] args) {
        //reflectConstructor();
        //ok(1);
        //ok("北京",1,2,3,4,5,6,7,8,9,10);
    }
    @Test
    public void reflectArray(){

        Object os=Array.newInstance(String.class,3);
        Array.set(os,0,"哈尔滨");
        Array.set(os,1,"长春");
        Array.set(os,2,"沈阳");
        System.out.println(Array.get(os,1));


    }

    public static void ok(String name,int ...a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println(sum);

    }
    @Test
    public void reflectField(){//反射字段，java中的全局变量

        try {
            Class<?> c=Class.forName(s);
            Object obj=c.newInstance();//实例化的对象
            //Field[]fs=c.getFields();//他看的是非私有字段
//            Field[]fs=c.getDeclaredFields();//他看的是所有字段。
//            for(Field f :fs){
//                System.out.println(f.getName());
//            }
            Field name=c.getDeclaredField("name");
            name.setAccessible(true);
            name.set(obj,"小牛");

            System.out.println(name.get(obj));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Test
    public void reflectMethod(){

        try {
            Class<?> c=Class.forName(s);
            Constructor con=c.getConstructor(int.class,String.class);//含义就是我的非默认构造器第一形参是整数类型，第二个形参是字符串类型

            Object o=con.newInstance(100,"小猪");

            Method m1=c.getMethod("setName",String.class);
            m1.invoke(o,"小鱼");

            Method m2=c.getMethod("getName");
            System.out.println(m2.invoke(o));

//            Method[] ms=c.getMethods();
//
//            for(Method m :ms){
//
//                System.out.println(m.getName());
//            }



        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }

    @Test
    public   void reflectNonConstructor(){
        try {
            Class<?> c=Class.forName(s);
            Constructor con=c.getConstructor(int.class,String.class);//含义就是我的非默认构造器第一形参是整数类型，第二个形参是字符串类型

            Object o=con.newInstance(100,"小猪");

            Animal a=(Animal)o;

            System.out.println(a.getAge()+"--"+a.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    private static void reflectConstructor() {//反射默认构造器

        try {
            Class<?> c=Class.forName(s);//反射

            Object o=c.newInstance();

            Animal a=(Animal)o;
            a.setName("小猫");
            System.out.println(a.getName());



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
