package com.weikun.F;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * Created by Administrator on 2016/12/5.
 */
public class B {
    @Test
    public void copy(){
        try (Reader r=new FileReader("c://66.txt");
             Writer w=new FileWriter("d://77.txt");
        ){
            char[] buffer=new char[1024];
            int n=-1;
            while( (n=r.read(buffer))!=-1){
                w.write(buffer,0,n);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

    }
}
