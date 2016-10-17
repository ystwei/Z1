/**
 * Created by Administrator on 2016/10/17.
 */
public class A {
    public static void main(String[] args) {
        System.out.println(-6.0/0);//分子 分母都是整数 结果一定是整数,但是如果有其他类型的话，按数据类型大的走
        System.out.println(4%2);
        System.out.println(2.1%4);//分子小于分母的余数是分子

        System.out.println(-6%4);
        System.out.println(6%-4);//余数的符号跟分子走
        System.out.println(-6%-4);//余数的符号跟分子走

      //  System.out.println(6%0);//0不能做除数
        System.out.println(6.0%0);//0不能做除数 not a number
        System.out.println(-6.0%0);

        String c="AB";
        char c1='A';
        char c2='我';//Unicode
        char c3='爱';
        int i='卫';
        int i1='崑';
        System.out.println(i);
        System.out.println(i1);

        char c4=21355;
        System.out.println(c4);

        char c5=21955;
        System.out.println(c5);


        int a='A';
        System.out.println(a);

        int a1='a';
        System.out.println(a1);


        int a2='0';
        System.out.println(a2);

        char a3=48;
        System.out.println(a3);

        int a4='z';
        System.out.println(a4);

    }
}
