package com.weikun.L;

import java.io.*;
import java.net.Socket;

/**
 * Created by Administrator on 2016/12/19.
 * 客户端接受文件
 */
public class P {
    public static void main(String[] args) {
        Socket client=null;
        DataInputStream dis=null;
        DataOutputStream dos=null;

        try {
            client=new Socket("127.0.0.1",8222);

            dis=new DataInputStream(client.getInputStream());
            String filename=dis.readUTF();
            File file=new File("d://"+filename);
            dos=new DataOutputStream(new FileOutputStream(file));
            int n=-1;
            byte[]buffer=new byte[1024];
            while((n=dis.read(buffer))!=-1 ){

                dos.write(buffer,0,n);
            }
            dos.flush();
            dos.close();

            dis.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
