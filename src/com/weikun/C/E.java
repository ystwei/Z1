package com.weikun.C;

/**
 * Created by Administrator on 2016/11/24.
 */
public class E {
    public static void main(String[] args) {
//       new IE(){
//
//            @Override
//            public void go() {
//                System.out.print("ok");
//            }
//        }.go();
//        E e=new E();
//
//        e.test(new IE(){
//
//
//            @Override
//            public void go() {
//                System.out.print("ok");
//            }
//        },"",new IE(){
//
//            @Override
//            public void go() {
//
//            }
//        },(long)3F);
        new E().bark(new IE(){


            @Override
            public void go() {
                System.out.print("ok1");
            }
        }).go();


    }//AWT Swing
    void test(IE ie,String a,IE ie1,long l){
        ie.go();
    }

    IE bark(IE i){
        i.go();
        return new IE(){

            @Override
            public void go() {
                System.out.print("ok");
            }
        };
    }
}
interface IE{
    void go();
}


