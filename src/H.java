/**
 * Created by Administrator on 2016/10/24.
 */
public class H {
    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        if(a>b && b++>30 ){
//            System.out.println("a:"+a+"b:"+b);
//        }
//        System.out.println("b:"+b);

//        short a=10;
//        int b=20;
//        //a=a+b;//检查数据类型的，安全，速度慢
//        a+=b;//不检查，速度快，不安全
//        System.out.println(a);
//        int a=0;
//        int b=100;
//
//        b = 20;
//        int e=a+b;//将表达式付给e
//        int a=2;
//        int b=3*a+++a+--a+1;
//        System.out.println(a);//2
//        System.out.println(b);//12
        int year=2001;
        System.out.println((((year%4==0)&&(year%100!=0))||(year%400==0))?"真":"假");
    }


}
