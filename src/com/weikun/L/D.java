package com.weikun.L;

import java.util.regex.Pattern;

/**
 * Created by Administrator on 2016/12/19.
 */
public class D {
    public static void main(String[] args) {
        //����Ϸ�����λС��,������ 99.1
        //һ���12���� 1--9 01 02 1 2
        // System.out.println(Pattern.matches("^[0-9]*(\\.[0-9]{2,})?$","999.1"));
        // System.out.println(Pattern.matches("^0[1-9]|[1-9]|10|11|12$","13"));
        //System.out.println(Pattern.matches("^C\\wT$","CAAT"));
        //System.out.println(Pattern.matches("^[^abc��]$","��"));


        // TODO Auto-generated method stub
        // \w:ƥ�����е����ַ�������0-9�������֣�26��Ӣ����ĸ���»���(_)
        //*:ָ��ǰ���ӱ��ʽ���Գ�����λ��Σ�
        String str="Hello,Java";
        //̰��ģʽ������:������ʾ��(*)��һ��ƥ����ȥ�����Ը��ַ���ǰ�����е����ַ�������ƥ�䵽��ֱ�������ո�
        System.out.println(str.replaceFirst("\\w+", "��"));//��,Java
        System.out.println(str.replaceAll("\\w+", "��"));
        //��ǿģʽ������������ʾ��(*)�ᾡ��ƥ�������ַ�����ƥ��0���ַ���
        System.out.println(str.replaceFirst("\\w+?", "��"));//��ello,Java
        System.out.println(str.replaceAll("\\w+?", "��"));//��ello,Java
    }
}
