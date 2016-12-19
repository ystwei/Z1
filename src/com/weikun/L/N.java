package com.weikun.L;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/19.
 * 客户端
 */
public class N {
    public static void main(String[] args) {
        try {
            Socket client=new Socket("127.0.0.1",9011);

            PrintWriter out=new PrintWriter(client.getOutputStream(),true);
            Scanner sc=new Scanner(System.in);

            while(sc.hasNext()){
                String word=sc.nextLine();
                out.println(word);
            }
            out.close();
            sc.close();


            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
