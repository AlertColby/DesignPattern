package main5;

import main3.bean.Department;

public class AccessServerDepartment implements IDepartment{

	@Override
	public void insert(Department dpt) {
		System.out.println("��AccessServerDepartment�в���һ��Department��¼");
	}

	@Override
	public Department getDepartment(String id) {
		System.out.println("��AccessServerDepartment��ͨ��id��ѯ�õ�һ��Department��¼");
		return null;
	}

}
