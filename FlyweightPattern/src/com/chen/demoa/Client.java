package com.chen.demoa;

public class Client {
	
	public static void main(String[] args) {
		SecurityMgr securityMgr = SecurityMgr.getInstance();
		
		securityMgr.login("����");
		securityMgr.login("����");
		
//		boolean hasPermit1 = securityMgr.hasPermit("����", "н������", "�鿴");
		boolean hasPermit2 = securityMgr.hasPermit("����", "н������", "�鿴");
		
//		System.out.println("hasPermit1:" + hasPermit1);
		System.out.println("hasPermit2:" + hasPermit2);
		
	}

}
