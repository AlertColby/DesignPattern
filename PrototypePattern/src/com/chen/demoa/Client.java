package com.chen.demoa;

public class Client {
	
	public static void main(String[] args) {
		EnterpriseOrder enterpriseOrder = new EnterpriseOrder();
		enterpriseOrder.setOrderId("����0012");
		enterpriseOrder.setEnterpriseName("��������");
		enterpriseOrder.setOrderProdectNumber(3008);
		
		OrderBusiness business = new OrderBusiness();
		business.saveOrder(enterpriseOrder);
	}

}
