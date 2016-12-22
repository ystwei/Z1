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
        //ok("����",1,2,3,4,5,6,7,8,9,10);
    }
    @Test
    public void reflectArray(){

        Object os=Array.newInstance(String.class,3);
        Array.set(os,0,"������");
        Array.set(os,1,"����");
        Array.set(os,2,"����");
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
    public void reflectField(){//�����ֶΣ�java�е�ȫ�ֱ���

        try {
            Class<?> c=Class.forName(s);
            Object obj=c.newInstance();//ʵ�����Ķ���
            //Field[]fs=c.getFields();//�������Ƿ�˽���ֶ�
//            Field[]fs=c.getDeclaredFields();//�������������ֶΡ�
//            for(Field f :fs){
//                System.out.println(f.getName());
//            }
            Field name=c.getDeclaredField("name");
            name.setAccessible(true);
            name.set(obj,"Сţ");

            System.out.println(name.get(obj));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Test
    public void reflectMethod(){

        try {
            Class<?> c=Class.forName(s);
            Constructor con=c.getConstructor(int.class,String.class);//��������ҵķ�Ĭ�Ϲ�������һ�β����������ͣ��ڶ����β����ַ�������

            Object o=con.newInstance(100,"С��");

            Method m1=c.getMethod("setName",String.class);
            m1.invoke(o,"С��");

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
            Constructor con=c.getConstructor(int.class,String.class);//��������ҵķ�Ĭ�Ϲ�������һ�β����������ͣ��ڶ����β����ַ�������

            Object o=con.newInstance(100,"С��");

            Animal a=(Animal)o;

            System.out.println(a.getAge()+"--"+a.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    private static void reflectConstructor() {//����Ĭ�Ϲ�����

        try {
            Class<?> c=Class.forName(s);//����

            Object o=c.newInstance();

            Animal a=(Animal)o;
            a.setName("Сè");
            System.out.println(a.getName());



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
