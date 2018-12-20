package com.chen.demoa;

public interface OrderApi{

	/**
	 * 获取订单产品的数量
	 * @return
	 */
	int getOrderProductNumber();
	
	/**
	 * 设置订单产品的数量
	 * @return
	 */
	void setOrderProdectNumber(int produceNumber );
	
	OrderApi cloneOrder();
}
