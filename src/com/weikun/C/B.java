package com.weikun.C;

/**
 * Created by Administrator on 2016/11/24.
 */
public class B {
    void go(final String address){
        int i=100;
        class B1{
            void bark(){
                System.out.print(address);

            }
        }
        new B1().bark();

    }
}
