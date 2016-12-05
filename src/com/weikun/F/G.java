package com.weikun.F;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2016/12/5.
 */
public class G {
    @Test
    public void mark(){
        ok("c://DOC");
    }

    public void ok(String path){
        File file=new File(path);

        File fs[]=file.listFiles();

        for(File f  :fs){
            if(f.isDirectory()){
                ok(f.getPath());
            }
            System.out.println(f.getPath());
        }

    }


    @Test
    public void go(){
        File file=new File("c://88");

           // file.createNewFile();
            file.mkdir();

       // System.out.println(file.isFile());
        //System.out.println(file.isDirectory());
    }
}
