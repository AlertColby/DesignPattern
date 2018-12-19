package main2;

public class AccessServerUser implements IUser {
	public void insert(User user){
		System.out.println("在AccessServerUser中插入一条User记录");
	}
	
	public User getUser(String id){
		System.out.println("在AccessServerUser中根据id得到一条User记录");
		return null;
	}
}
