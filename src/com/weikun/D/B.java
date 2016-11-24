package com.weikun.D;

import java.math.BigDecimal;
import java.util.Random;

/**
 * Created by Administrator on 2016/11/24.
 */
public class B {
    public static void main(String[] args) {
//        System.out.print(Math.ceil(3.1));//向上取整
//        System.out.print(Math.floor(3.6));//向下取整
//        System.out.print(Math.pow(2,3));

       for(int i=0;i<5;i++){
            //System.out.println((int)(Math.random()*5+5));//[5,10)
            //[A-Z]

           // System.out.println((char)(Math.random()*26+65));
            //a--z
           //20000 -29999
            Random r=new Random();
            System.out.println((char)(r.nextInt(9999)+20000));
       }

        //System.out.println(Math.round(1.36));
       // BigDecimal bd=new BigDecimal(8.736435464);
        //System.out.print(bd.setScale(-1,BigDecimal.ROUND_HALF_UP));
    }
}
