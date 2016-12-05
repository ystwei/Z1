package com.weikun.F;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Random;

/**
 * Created by Administrator on 2016/12/5.
 */
public class E {

    @Test
    public void merege(){
        File file=new File("c:\\2.mp3");
        try (
                RandomAccessFile r=new RandomAccessFile("c:\\1.mp3","r");
                RandomAccessFile w=new RandomAccessFile(file,"rw")){
            int n=-1;
            byte buffer[] =new byte[1024];
            w.seek(file.length());//定位到文件末尾
            while( (n=r.read(buffer))!=-1){
                w.write(buffer,0,n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void copy(){
        try {
            RandomAccessFile r=new RandomAccessFile("d:\\zj.rmvb","r");
            RandomAccessFile w=new RandomAccessFile("c:\\zj.rmvb","rw");
            int n=-1;
            byte[] buffer=new byte[1024];
            while( (n=r.read(buffer))!=-1){
                w.write(buffer,0,n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
