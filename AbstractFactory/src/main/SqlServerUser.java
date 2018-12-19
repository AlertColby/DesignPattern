package main;

public class SqlServerUser {

	public void insert(User user){
		System.out.println("在SqlServer中插入一条User记录");
	}
	
	public void getUser(String id){
		System.out.println("在Sqlserver中根据id得到一条User记录");
	}
}
