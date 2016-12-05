package com.weikun.F;

import org.junit.Test;

import java.io.*;

/**
 * Created by Administrator on 2016/12/5.
 */
public class C {

    @Test
    public void copy(){

        try (BufferedInputStream bis=new BufferedInputStream(
                new FileInputStream("d://zj.rmvb"),1024*1024*10);
             BufferedOutputStream bos=new BufferedOutputStream(
                     new FileOutputStream("c://zj.rmvb"),1024*1024*10);



        ){
            byte[] buffer=new byte[1024*1024*10];
            int n=-1;
            while( (n=bis.read(buffer))!=-1){
                bos.write(buffer,0,n);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

    }
}
