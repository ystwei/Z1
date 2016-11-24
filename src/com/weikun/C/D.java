package com.weikun.C;

/**
 * Created by Administrator on 2016/11/24.
 */
public class D {
    class D1{
        void go(){
            class D11{
                void bark(){
                    System.out.print("你好吗？");
                }
            }
            new D11().bark();
        }
    }
    void plan(){
        new D1().go();
    }
}
