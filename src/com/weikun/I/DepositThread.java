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
//���
public class DepositThread extends Thread{
	//ģ���û��˻�
	private Account account;
	//��ǰȡǮ�߳���ϣ������Ǯ��
	private int depositAmount;

	public DepositThread(String name , Account account ,
						 int depositAmount){
		super(name);
		this.account = account;
		this.depositAmount = depositAmount;
	}

	//�ظ�100��ִ�д�����
	public void run(){
		for (int i = 0 ; i < 10 ; i++ ){
			account.saveMoney(depositAmount);
		}		
	}
}