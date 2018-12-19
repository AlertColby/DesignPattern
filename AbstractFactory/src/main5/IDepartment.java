package main5;

import main3.bean.Department;

public interface IDepartment {
	
	void insert(Department dpt );
	
	Department getDepartment(String id);

}
