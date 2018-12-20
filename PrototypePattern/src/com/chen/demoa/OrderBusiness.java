package com.chen.demoa;

/**
 * 处理订单的业务对象
 * @author cqs
 *
 */
public class OrderBusiness {

	/**
	 * 创建订单
	 * @param order
	 */
	public void saveOrder(OrderApi order) {
		
		//1.判断当前订单预定产品数量是否大于1000
		while( order.getOrderProductNumber() > 1000) {
			//2.如果大于，还需要继续拆分
			//2.1 再新建一个订单对象，除数量不一样外其他都一样
			OrderApi newOrder = order.cloneOrder();
			newOrder.setOrderProdectNumber(1000);
			System.out.println("新订单：" + newOrder.toString());
			order.setOrderProdectNumber( order.getOrderProductNumber() - 1000 );
		}
		
		System.out.println("订单：" + order.toString());
		
	}
}
