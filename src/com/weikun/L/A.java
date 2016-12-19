package com.weikun.L;

import java.util.*;

/**
 * Created by Administrator on 2016/12/19.
 */
public class A {
    public static void main(String[] args) {



        Map <String,String>map=new HashMap<String,String>();
        map.put("a","A");
        map.put("b","B");
        map.put("c","C");
        List<Map.Entry<String,String>> list=new ArrayList<Map.Entry<String,String>>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<String,String>>(){
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {

                return o1.getKey().compareTo(o2.getKey());

            }
        });

        for(Map.Entry<String,String> m :list){

            System.out.println(m.getKey()+":"+m.getValue());

        }



//        Set<String> s=map.keySet();
//
//        Iterator<String> it=s.iterator();
//        while(it.hasNext()){
//            String key=it.next();
//            System.out.println(key+":"+map.get(key));
//        }



    }
}
