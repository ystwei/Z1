package com.weikun.E;

/**
 * Created by Administrator on 2016/12/1.
 */
public class D {
    public static void main(String[] args) {
        float d = -345.678f;
        String s = "你好！";
        int i = 1234;
        System.out.printf("%f",d); //"f"表示格式化输出浮点数。
        System.out.println();
        System.out.printf("%9.2f",d); //"9.2"中的9表示输出的长度，2表示小数点后的位数。

        System.out.println();
        System.out.printf("%+9.2f",d); //"+"表示输出的数带正负号。
        System.out.println();
        System.out.printf("%-9.4f",d); //"-"表示输出的数左对齐（默认为右对齐）。
        System.out.println();
        System.out.printf("%+-9.3f",d); //"+-"表示输出的数带正负号且左对齐。
        System.out.println();
        System.out.printf("%d",i); //"d"表示输出十进制整数。
        System.out.println();
        System.out.printf("%o",i); //"o"表示输出八进制整数。
        System.out.println();
        System.out.printf("%x",i); //"d"表示输出十六进制整数。
        System.out.println();
        System.out.printf("%#x",i); //"d"表示输出带有十六进制标志的整数。
        System.out.println();
        System.out.printf("%s",s); //"d"表示输出字符串。
        System.out.println();
        System.out.printf("输出一个浮点数：%f，一个整数：%d，一个字符串：%s",d,i,s);


        System.out.println();
        System.out.printf("字符串：%2$s，%1$d的十六进制数：%1$#x",i,s);
    }
}
