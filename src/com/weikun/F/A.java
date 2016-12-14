package com.weikun.F;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * Created by Administrator on 2016/12/5.
 */
public class A {
    public static void main(String[] args) {

    }

    @Test
    public void copy(){
        try (   FileInputStream fis=new FileInputStream("d://zj.rmvb");
                FileOutputStream fos=new FileOutputStream("c://zj.rmvb");
        ){
            int n=-1;
            long start=System.currentTimeMillis();
            byte[] buffer=new byte[1024*1024*10];

            while( (n=fis.read(buffer))!=-1){
                fos.write(buffer,0,n);
            }
            long end=System.currentTimeMillis();
            SimpleDateFormat sdf=new SimpleDateFormat("mm:ss");
            System.out.println(sdf.format(end-start));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void write(){

        try (FileOutputStream fos=new FileOutputStream("c://66.txt",false)){

            fos.write("你好".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

    }

    @Test
    public  void read() {
        try (FileInputStream fis=new FileInputStream("c://66.txt")){//1.1k
            byte[] buffer=new byte[1024];//1k
            int n=-1;
            while( (n=fis.read(buffer))!=-1  ){
                System.out.println(new String(buffer));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{

        }
    }

}
