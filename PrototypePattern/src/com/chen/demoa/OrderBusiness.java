package com.chen.demoa;

/**
 * ��������ҵ�����
 * @author cqs
 *
 */
public class OrderBusiness {

	/**
	 * ��������
	 * @param order
	 */
	public void saveOrder(OrderApi order) {
		
		//1.�жϵ�ǰ����Ԥ����Ʒ�����Ƿ����1000
		while( order.getOrderProductNumber() > 1000) {
			//2.������ڣ�����Ҫ�������
			//2.1 ���½�һ���������󣬳�������һ����������һ��
			OrderApi newOrder = order.cloneOrder();
			newOrder.setOrderProdectNumber(1000);
			System.out.println("�¶�����" + newOrder.toString());
			order.setOrderProdectNumber( order.getOrderProductNumber() - 1000 );
		}
		
		System.out.println("������" + order.toString());
		
	}
}
