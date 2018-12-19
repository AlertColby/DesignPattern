package main5;

import main3.bean.User;

public class SqlServerUser implements IUser{

	public void insert(User user){
		System.out.println("在SqlServer中插入一条User记录");
	}
	
	public User getUser(String id){
		System.out.println("在Sqlserver中根据id得到一条User记录");
		return null;
	}
}
