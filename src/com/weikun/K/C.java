package com.weikun.K;

import java.util.*;

/**
 * Created by Administrator on 2016/12/15.
 */
public class C {
    public static void main(String[] args) {
        Hashtable<String,Integer> t=new Hashtable<>();//线程安全，速度慢
       // HashMap<String,Integer> t=new HashMap<>();//线程不安全，速度快
        t.put("A",1);
        t.put("B",2);
        t.put("C",3);
        t.put("D",4);
        t.put(null,null);

        Collection<Integer> cs=t.values();
        Iterator<Integer> it=cs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
//        System.out.println("-----");
//        Enumeration<String> es=t.keys();
//        while(es.hasMoreElements()){
//            String key=es.nextElement();
//            System.out.println (key+"--"+t.get(key));
//        }
        System.out.println("-----");
        Set<String> s=t.keySet();

        Iterator<String> it1=s.iterator();
        while(it1.hasNext()){
            String key=it1.next();
            System.out.println (key+"--"+t.get(key));
        }
        System.out.println("-----");

        Set <Map.Entry<String,Integer>>ss=t.entrySet();

        Iterator<Map.Entry<String,Integer>> it2=ss.iterator();

        while(it2.hasNext()){
            Map.Entry<String,Integer> m=it2.next();
            System.out.println(m.getKey()+"---"+m.getValue());
        }



    }
}
