/**
 * Created by Administrator on 2016/10/23.
 */
public class C {
    public static void main(String[] args) {
        System.out.println(-2.2/-0.0);//ArithmeticException
        String c="AB";//char [0-65535]
        int c1='卫';
        char 你=21355;//int=char[0-65535]: \u0000---\uFFFF unicode ASCII[0-255]
        System.out.println(c1);
        System.out.println(你);
        int c2='\t';//空格的unicode的10进制
        System.out.println(c2);//A:65 Z:90 a:97 z:122 \n:10 \r:13 \b:8 \t:9
        char c3='\u000B';
        System.out.println(c3);

        String s="北京"+'\n'+"我爱你";
        String s1="北京\n我爱你";
        System.out.print("北京\\\\天安门");
        System.out.print("我恨你");
        String s2=null;//栈为空
    }
}
