package com.chen.demoa.model;

/**
 * 描述输出数据的对象
 * @author  cqs
 *
 */
public class ExportDataModel {

	/**
	 * 产品编号
	 */
	private String productId;
	
	/**
	 * 销售价格
	 */
	private double price;
	
	/**
	 * 销售数量
	 */
	private double mount;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getMount() {
		return mount;
	}

	public void setMount(double mount) {
		this.mount = mount;
	}
	
}
