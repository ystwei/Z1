/**
 * Created by Administrator on 2016/10/23.
 */
public class C {
    public static void main(String[] args) {
        System.out.println(-2.2/-0.0);//ArithmeticException
        String c="AB";//char [0-65535]
        int c1='��';
        char ��=21355;//int=char[0-65535]: \u0000---\uFFFF unicode ASCII[0-255]
        System.out.println(c1);
        System.out.println(��);
        int c2='\t';//�ո��unicode��10����
        System.out.println(c2);//A:65 Z:90 a:97 z:122 \n:10 \r:13 \b:8 \t:9
        char c3='\u000B';
        System.out.println(c3);

        String s="����"+'\n'+"�Ұ���";
        String s1="����\n�Ұ���";
        System.out.print("����\\\\�찲��");
        System.out.print("�Һ���");
        String s2=null;//ջΪ��
    }
}
