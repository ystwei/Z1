package com.weikun.E;

/**
 * Created by Administrator on 2016/12/1.
 */
public class F {

    public static void main(String[] args)  {

            new F().go();

    }
    void go() {
        String result="SUCCESS";
        if(result.equals("�㱻ץ�ˣ�")){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("����ˣ�");
    }
}
