package com.weikun.K;

import java.util.*;

/**
 * Created by Administrator on 2016/12/15.
 */
public class A {
    public static void main(String[] args) {
        Vector<String> list=new Vector<>();//�߳�ͬ���ģ���ȫ�ģ��ٶ���

        list.add("A");
        list.add("B");
        list.add("C");

        //ר�ã�ֻ��ͬ���ļ��ϲ�ʹ��
        Enumeration es=list.elements();

        while(es.hasMoreElements()){
            System.out.println(es.nextElement());
        }


        //�̲߳�ͬ�����ٶȿ죬����ȫ
//        List list=new ArrayList();//��̬���鷽������,
//        list.add("A");
//        list.add("B");//Integer
//        list.add("C");//Integer


        Iterator<String> it=list.iterator();

        while( it.hasNext()){
            String o=it.next();
            System.out.println(o);
        }
        System.out.println("-----------");

        ListIterator<String> it1=list.listIterator();

        while(it1.hasNext()){
            String o=it1.next();
            System.out.println(o);
        }
        while(it1.hasPrevious()){
            String o=it1.previous();
            System.out.println(o);
        }
        System.out.println("-----------");

        for(String o : list){
            System.out.println(o);

        }
        System.out.println("-----------");

        Object [] os=list.toArray();

        for(int i=0;i<os.length;i++){
            System.out.println(os[i]);

        }

        System.out.println("-----------");
        //list.remove(1);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("-----------");



    }

}
