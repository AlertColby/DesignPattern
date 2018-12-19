package main4;

import main3.bean.Department;

public class SqlServerDepartment implements IDepartment{

	@Override
	public void insert(Department dpt) {
		System.out.println("在SqlServerDepartment中插入一条Department记录");	
	}

	@Override
	public Department getDepartment(String id) {
		System.out.println("在SqlServerDepartment中通过id查询得到一条Department记录");
		return null;
	}

}
