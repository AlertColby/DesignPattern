package com.chen.demoa;

public class EnterpriseOrder implements OrderApi , Cloneable{
	
	private String enterpriseName;
	
	private int productNumber;
	
	private String orderId;

	@Override
	public int getOrderProductNumber() {
		// TODO Auto-generated method stub
		return this.productNumber;
	}

	@Override
	public void setOrderProdectNumber(int productNumber) {
		// TODO Auto-generated method stub
		this.productNumber = productNumber;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "EnterpriseOrder [enterpriseName=" + enterpriseName + ", productNumber=" + productNumber + ", orderId="
				+ orderId + "]";
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
		//������ǳ�ȿ�¡�����Ҫ��ȿ�¡������Ҫ������Ӧ������
		return (OrderApi) this.clone();
	}
	
}
