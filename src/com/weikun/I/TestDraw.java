package com.weikun.I;

/**
 * @author  yeeku.H.lee weikun@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, weikun
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * 
 * <br>Date: 
 */
public class TestDraw{
	public static void main(String[] args)	{
		//����һ���˻�
		Account acct = new Account("1234567" , 0);
		new DrawThread("ȡǮ��" , acct , 800).start();
		new DepositThread("����߱�" , acct , 800).start();
	}
}
 