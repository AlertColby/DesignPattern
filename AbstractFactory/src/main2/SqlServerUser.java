package main2;

public class SqlServerUser implements IUser{

	public void insert(User user){
		System.out.println("��SqlServer�в���һ��User��¼");
	}
	
	public User getUser(String id){
		System.out.println("��Sqlserver�и���id�õ�һ��User��¼");
		return null;
	}
}
