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
	 * ����һ�������Ķ���
	 * @return
	 */
	public InsuranceContract build() {
		//�Զ�������ݽ���Լ������֤
		boolean signPerson = this.personName != null && this.personName.trim().length() > 0;
		boolean signCompany = this.companyName != null && this.companyName.trim().length() > 0;
		if( signPerson && signCompany) {
			throw new IllegalStateException("һ�ݱ��ղ������˺͹�˾��ͬǩ��");
		}
		if( !signPerson && !signCompany) {
			throw new IllegalStateException("�������˻�˾ǩ���������ɱ���");
		}
		if( this.contractId == null || this.contractId.trim().length() == 0) {
			throw new IllegalStateException("������д���ձ��");
		}
		
		if( this.beginDate <= 0 || this.endDate <= 0) {
			throw new IllegalStateException("������д���յĿ�ʼ�ͽ�������");
		}
		
		if( this.beginDate > this.endDate) {
			throw new IllegalStateException("��ʼ���ڲ��ܴ��ڽ�������");
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
