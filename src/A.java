/**
 * Created by Administrator on 2016/10/17.
 */
public class A {
    public static void main(String[] args) {
        System.out.println(-6.0/0);//���� ��ĸ�������� ���һ��������,����������������͵Ļ������������ʹ����
        System.out.println(4%2);
        System.out.println(2.1%4);//����С�ڷ�ĸ�������Ƿ���

        System.out.println(-6%4);
        System.out.println(6%-4);//�����ķ��Ÿ�������
        System.out.println(-6%-4);//�����ķ��Ÿ�������

      //  System.out.println(6%0);//0����������
        System.out.println(6.0%0);//0���������� not a number
        System.out.println(-6.0%0);

        String c="AB";
        char c1='A';
        char c2='��';//Unicode
        char c3='��';
        int i='��';
        int i1='��';
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
