package com.chen.undo;

public interface OperationApi {
	
	/**
	 * ��ȡ������ɺ��ֵ
	 * @return
	 */
	int getResult();
	
	/**
	 * ���ü���ĳ�ʼֵ
	 */
	void setResult( int num );
	
	/**
	 * ִ�мӷ�
	 * @param num
	 */
	void add( int num);
	
	/**
	 * ִ�м���
	 * @param num
	 */
	void substract(int num);

}
