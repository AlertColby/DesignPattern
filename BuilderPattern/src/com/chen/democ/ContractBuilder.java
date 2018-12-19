package com.chen.democ;

public class ContractBuilder {
	
	private String contractId;
	
	private String personName;
	
	private String companyName;
	
	private long beginDate;
	
	private long endDate;
	
	
	public ContractBuilder setContractId(String contractId) {
		this.contractId = contractId;
		return this;
	}

	public ContractBuilder setPersonName(String personName) {
		this.personName = personName;
		return this;
	}

	public ContractBuilder setCompanyName(String companyName) {
		this.companyName = companyName;
		return this;
	}

	public ContractBuilder setBeginDate(long beginDate) {
		this.beginDate = beginDate;
		return this;
	}

	public ContractBuilder setEndDate(long endDate) {
		this.endDate = endDate;
		return this;
	}
	
	/**
	 * 返回一个完整的对象
	 * @return
	 */
	public InsuranceContract build() {
		//对对象的数据进行约束与验证
		boolean signPerson = this.personName != null && this.personName.trim().length() > 0;
		boolean signCompany = this.companyName != null && this.companyName.trim().length() > 0;
		if( signPerson && signCompany) {
			throw new IllegalStateException("一份保险不能由人和公司共同签名");
		}
		if( !signPerson && !signCompany) {
			throw new IllegalStateException("必须有人或公司签名才能生成保险");
		}
		if( this.contractId == null || this.contractId.trim().length() == 0) {
			throw new IllegalStateException("必须填写保险编号");
		}
		
		if( this.beginDate <= 0 || this.endDate <= 0) {
			throw new IllegalStateException("必须填写保险的开始和结束日期");
		}
		
		if( this.beginDate > this.endDate) {
			throw new IllegalStateException("开始日期不能大于结束日期");
		}
		return new InsuranceContract(this);
	}

	public String getContractId() {
		return contractId;
	}

	public String getPersonName() {
		return personName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public long getBeginDate() {
		return beginDate;
	}

	public long getEndDate() {
		return endDate;
	}
	
	
	
}
