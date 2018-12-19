package main2;

/**
 * 工厂方法模式
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
//		User u = new User();
		//不能这样直接new,因为如果多处都要改怎么办？
//		IUser iu = new SqlServerUser();
//		iu.insert(u);
//		iu.getUser("");
		
		//为什么加了这个工厂之后就容易了呢?
		//因为这个iFactory变量可以存为一个全局变量，如果要替换数据库，只需替换这一行代码即可
		IFactory iFactory = new SqlServerFactory();
//		IFactory iFactory = new AccessServerFactory();
		
		User u1 = new User();
		IUser iUser = iFactory.createUser();
		iUser.insert(u1);
		User userFromDb = iUser.getUser("");
		
		User u2 = new User();
		IUser iUser1 = iFactory.createUser();
		iUser1.insert(u2);
		User userFromDb1 = iUser.getUser("");
		
		User u3 = new User();
		IUser iUser2 = iFactory.createUser();
		iUser2.insert(u3);
		User userFromDb2 = iUser.getUser("");
		
		User u4 = new User();
		IUser iUser3 = iFactory.createUser();
		iUser3.insert(u4);
		User userFromDb3 = iUser.getUser("");
		
		
	}
}
