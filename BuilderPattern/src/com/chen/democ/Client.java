package com.chen.democ;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
		InsuranceContract ic = new ContractBuilder()
				.setContractId("PM123212143r43")
				.setPersonName("ЭѕвуЪБ")
				.setBeginDate(new Date().getTime() )
				.setEndDate(new Date().getTime() + 2000)
				.build();
		ic.otherOperation();
	}
	
}
