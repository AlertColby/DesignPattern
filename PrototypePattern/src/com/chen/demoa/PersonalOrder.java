package com.chen.demoa;

public class PersonalOrder implements OrderApi , Cloneable{
	
	/**
	 * ��������
	 */
	private String personName;
	
	/**
	 * ������Ʒ����
	 */
	private int productNumber;

	/**
	 * �������
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
