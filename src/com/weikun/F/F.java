package com.weikun.F;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

/**
 * Created by Administrator on 2016/12/5.
 */
public class F {
    @Test
    public void go(){
        int i=100;
        int j=129;
        int k=79;
        ByteArrayOutputStream bos=new ByteArrayOutputStream();

        bos.write(i);
        bos.write(j);
        bos.write(k);

        byte buffer[]=bos.toByteArray();

        for(int a=0;a<buffer.length;a++){
            System.out.println(buffer[a]);
        }


    }
}
