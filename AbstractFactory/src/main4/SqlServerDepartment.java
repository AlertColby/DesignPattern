package main4;

import main3.bean.Department;

public class SqlServerDepartment implements IDepartment{

	@Override
	public void insert(Department dpt) {
		System.out.println("��SqlServerDepartment�в���һ��Department��¼");	
	}

	@Override
	public Department getDepartment(String id) {
		System.out.println("��SqlServerDepartment��ͨ��id��ѯ�õ�һ��Department��¼");
		return null;
	}

}
