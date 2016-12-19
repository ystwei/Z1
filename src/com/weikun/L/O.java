package com.weikun.L;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2016/12/19.
 *
 * //服务器发送文件
 */
public class O {
    public static void main(String[] args) {
        Socket client=null;
        ServerSocket server= null;
        DataInputStream dis=null;
        DataOutputStream dos=null;

        try {
            server=new ServerSocket(8222);

            File file=new File("c://正则表达式.wmv");

            dis= new DataInputStream(new FileInputStream(file));
            client=server.accept();
            dos =new DataOutputStream(client.getOutputStream());

            dos.writeUTF(file.getName());//写文件名给客户端
            dos.flush();

            //写文件
            int n=-1;
            byte[] buffer=new byte[1024];
            while((n=dis.read(buffer))!=-1){

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
