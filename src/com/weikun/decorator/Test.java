package com.weikun.decorator;

/**
 * Created by Administrator on 2016/12/22.
 */
public class Test {
    public static void main(String[] args) {

        Girl girl=new AmericanGirl();
        System.out.println(girl.getDesc());

        Girl g=new CodingGirl(girl);
        System.out.println(g.getDesc());


        Girl g1=new ArtGirl(g);
        System.out.println(g1.getDesc());
    }
}
