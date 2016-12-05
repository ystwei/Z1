package com.weikun.F;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/5.
 */
public class D {
    public static void main(String[] args) {
        new D().in2();
    }
    public void in2(){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            try {
                String result=br.readLine();
                if(result.trim().toUpperCase().equals("Q")){
                    break;
                }
                System.out.println(result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    public void in1(){
        InputStream is=System.in;

        while(true){
            byte[] buffer=new byte[1024];
            try {
                is.read(buffer);
                if(new String(buffer).trim().toUpperCase().equals("Q")){
                    break;
                }
                System.out.println(new String(buffer).trim());



            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public void in(){
        Scanner sc=new Scanner(System.in);
        //System.out.println("请输入你的姓名：");
        while(true){
            String result=sc.nextLine();//q Q就是退出
            if(result.toUpperCase().equals("Q")){
               // System.exit(0);
                break;
            }
            System.out.println(result);
        }

    }
}
