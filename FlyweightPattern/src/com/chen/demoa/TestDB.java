package com.chen.demoa;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ������ʹ��,ģ�����ݿ��е�ֵ
 * @author Administrator
 *
 */
public class TestDB {

	/**
	 * ���������Ȩ���ݵ�ֵ
	 */
	public static Collection<String> colDb = new ArrayList<>();
	
	static {
		colDb.add("����,��Ա�б�,�鿴");
		colDb.add("����,��Ա�б�,�鿴");
		colDb.add("����,н������,�鿴");
		colDb.add("����,н������,�޸�");
		
		for(int i = 0 ; i < 5 ; i++) {
			colDb.add("����" + i + ",��Ա�б�,�鿴" );
		}
	}
}
