package com.chen.demoa;

/**
 * 
 * @author cqs
 *
 */
public class GiGaMainBoard implements MainBoardApi {

	@Override
	public void open() {
		System.out.println("���������������ڿ�������Ⱥ�");
		System.out.println("��ͨ��Դ");
		System.out.println("�豸���");
		System.out.println("װ��ϵͳ");
		System.out.println("����������������");
		System.out.println("�ѿ������ɲ���");
	}

	@Override
	public void reset() {
		System.out.println("������������������������Ⱥ�");
		System.out.println("�ѿ������ɲ���");
	}

}
