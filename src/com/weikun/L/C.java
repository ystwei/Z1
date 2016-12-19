package com.weikun.L;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Administrator on 2016/12/19.
 */
public class C {
    public static void main(String[] args) {
        Set<String> s=new HashSet<>();
        s.add("a");
        s.add("b");
        s.add("c");
        Iterator<String> it=s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
