package com.chen.demoa.model;

/**
 * ����������ݵĶ���
 * @author  cqs
 *
 */
public class ExportDataModel {

	/**
	 * ��Ʒ���
	 */
	private String productId;
	
	/**
	 * ���ۼ۸�
	 */
	private double price;
	
	/**
	 * ��������
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
