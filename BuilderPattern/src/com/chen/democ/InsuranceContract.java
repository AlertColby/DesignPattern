package com.chen.democ;

public class InsuranceContract {
	
	private String contractId;
	
	private String personName;
	
	private String companyName;
	
	private long beginDate;
	
	private long endDate;

	InsuranceContract( ContractBuilder builder) {
		super();
		this.contractId = builder.getContractId();
		this.personName = builder.getPersonName();
		this.companyName = builder.getCompanyName();
		this.beginDate = builder.getBeginDate();
		this.endDate = builder.getEndDate();
	}
	
	
	public void otherOperation() {
		System.out.println(" some operation ," + this.contractId);
	}
	

}
