/**
 * Created by Administrator on 2016/10/23.
 */
public class D {
    public static void main(String[] args) {
//        long l=20l;
//        float f=l;
//        int i=100;
//        char s='A';
//        byte b=(byte)s;
//        System.out.println(b);
        int iValue=256;//
        //强制把一个int类型的值转换为byte类型的值
        byte bValue=(byte)iValue;//-128--0-127
        System.out.println(bValue);//将输出多少？为什么
        short s3=100;
        s3=(short)(s3+2);

        byte b=25;//25.0
        char c='a';//97.0
        int i=23;
        double d=.3;
        //右边表达式中在最高等级操作数为duble类型，
        //则右边表达式的类型为double型，故付给一个double型变量
        float result=(float)(b+c+i*d);
        System.out.println(result);
        System.out.println('a'+""+1);
        System.out.println('a'+1+"");

        System.out.println(1+""+'a'+'b');
        System.out.println('a'+""+'b');
        System.out.println('d'+1*'a'+'c');


    }
}
