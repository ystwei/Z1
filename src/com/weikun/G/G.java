package com.weikun.G;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2016/12/14.
 */
public class G extends TimerTask{
    private int imgId;//ͼƬ��ţ�
    private int imgCount;//ͼƬ����
    private Timer timer;//������
    public G(Timer timer,int imgCount){
        this.timer=timer;
        this.imgCount=imgCount;
    }
    @Override
    public void run() {
        if(++imgId<=imgCount){//��Ϸû�������

            System.out.println("��Ϸ���ص���"+imgId+"��ͼƬ");
        }else{
            System.out.println("������Ϸ!");
            timer.cancel();//�ü�����ֹͣ
        }
    }
}
