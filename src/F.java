/**
 * Created by Administrator on 2016/10/23.
 */
public class F {
    public static void main(String[] args) {
        int a=1;
        int b=a++;
        //    2*1+(-3)+(-3)+2+1=-1
        int c=a++*1+-a+-a+--a+1;
        System.out.print(c);
        System.out.println("-5.0对0求余的结果是:" + -5.0 % 0);
        System.out.println("0对0.0求余的结果是:" + 0 % 0.0);
    }
}
