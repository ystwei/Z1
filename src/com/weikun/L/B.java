package com.weikun.L;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by Administrator on 2016/12/19.
 */
public class B {
    public static void main(String[] args) {
        Properties pro=new Properties();
        File file=new File("my1.ini");
        try {
            FileInputStream fis=new FileInputStream(file);
            pro.load(fis);

            Enumeration en=pro.elements();

            while(en.hasMoreElements()){
                String s=en.nextElement().toString();

                System.out.println(new String(s.getBytes("ISO8859-1"),"utf-8"));

            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
