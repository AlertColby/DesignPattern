package com.chen.demoa;

public interface OrderApi{

	/**
	 * ��ȡ������Ʒ������
	 * @return
	 */
	int getOrderProductNumber();
	
	/**
	 * ���ö�����Ʒ������
	 * @return
	 */
	void setOrderProdectNumber(int produceNumber );
	
	OrderApi cloneOrder();
}
