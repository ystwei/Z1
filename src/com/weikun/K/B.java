package com.weikun.K;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Administrator on 2016/12/15.
 */
public class B {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        list.add(1);
        list.addFirst(2);
        list.addLast(3);
        list.add(4);
        list.add(5);
        list.push(6);
        list.push(7);
        list.offer(8);
        list.offerFirst(9);
        list.offerLast(10);
        list.remove();
        list.removeFirst();
        list.removeLast();
        list.pop();//µ¯³öÕ»¶¥
        list.pop();
        list.poll();//É¾³ıÕ»¶¥
        list.pollFirst();//É¾³ıÕ»¶¥
        list.pollLast();
        System.out.println(list.peek());//¼ì²éÕ»¶¥
        System.out.println(list.peekFirst());//¼ì²éÕ»¶¥
        System.out.println(list.peekLast());//¼ì²éÕ»Î²


        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
