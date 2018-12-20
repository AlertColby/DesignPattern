package com.chen.demoa;

public class PersonalOrder implements OrderApi , Cloneable{
	
	/**
	 * 个人名字
	 */
	private String personName;
	
	/**
	 * 订单产品数量
	 */
	private int productNumber;

	/**
	 * 订单编号
	 */
	private String orderId;
	
	
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Override
	public int getOrderProductNumber() {
		// TODO Auto-generated method stub
		return productNumber;
	}

	@Override
	public void setOrderProdectNumber(int productNumber) {
		// TODO Auto-generated method stub
		this.productNumber = productNumber;
	}

	@Override
	public String toString() {
		return "PersonalOrder [personName=" + personName + ", productNumber=" + productNumber + ", orderId=" + orderId
				+ "]";
	}
	
	@Override
	protected Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public OrderApi cloneOrder() {
		return (OrderApi) this.clone();
	}
	
	
}
