package main2;

public class AccessServerUser implements IUser {
	public void insert(User user){
		System.out.println("��AccessServerUser�в���һ��User��¼");
	}
	
	public User getUser(String id){
		System.out.println("��AccessServerUser�и���id�õ�һ��User��¼");
		return null;
	}
}
