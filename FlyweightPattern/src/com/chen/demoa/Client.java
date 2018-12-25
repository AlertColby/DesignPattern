package com.chen.demoa;

public class Client {
	
	public static void main(String[] args) {
		SecurityMgr securityMgr = SecurityMgr.getInstance();
		
		securityMgr.login("张三");
		securityMgr.login("李四");
		
//		boolean hasPermit1 = securityMgr.hasPermit("张三", "薪资数据", "查看");
		boolean hasPermit2 = securityMgr.hasPermit("李四", "薪资数据", "查看");
		
//		System.out.println("hasPermit1:" + hasPermit1);
		System.out.println("hasPermit2:" + hasPermit2);
		
	}

}
