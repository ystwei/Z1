package com.weikun.L;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2016/12/19.
 * //服务器端
 */
public class M {
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(9011);
            Socket client=ss.accept();

            InputStream is=client.getInputStream();

            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            boolean flag=true;
            while(flag){
                String word=br.readLine();
                if(word.trim().toLowerCase().equals("q")){
                    System.out.println("她走了");
                    flag=false;
                }else{

                    System.out.println(word);
                }
            }


            client.close();
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
