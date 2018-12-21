package com.chen.undo;

public interface OperationApi {
	
	/**
	 * 获取计算完成后的值
	 * @return
	 */
	int getResult();
	
	/**
	 * 设置计算的初始值
	 */
	void setResult( int num );
	
	/**
	 * 执行加法
	 * @param num
	 */
	void add( int num);
	
	/**
	 * 执行减法
	 * @param num
	 */
	void substract(int num);

}
