package com.weikun.I;

/**
 * Description:
 * <br/>Copyright (C), 2008-2010, weikun
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  weikun@163.com
 * @version  1.0
 */
//ȡ��
public class DrawThread extends Thread{
	//ģ���û��˻�
	private Account account;
	//��ǰȡǮ�߳���ϣ��ȡ��Ǯ��
	private int drawAmount;

	public DrawThread(String name , Account account ,
					  int drawAmount){
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}

	//�ظ�100��ִ��ȡǮ����
	public void run(){
		for (int i = 0 ; i < 10 ; i++ ){
			account.getMoney(drawAmount);
		}
	}
}