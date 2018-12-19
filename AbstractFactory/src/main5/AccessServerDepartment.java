package main5;

import main3.bean.Department;

public class AccessServerDepartment implements IDepartment{

	@Override
	public void insert(Department dpt) {
		System.out.println("在AccessServerDepartment中插入一条Department记录");
	}

	@Override
	public Department getDepartment(String id) {
		System.out.println("在AccessServerDepartment中通过id查询得到一条Department记录");
		return null;
	}

}
