package main3;

import main3.bean.Department;
import main3.bean.User;

/**
 * 工厂方法模式只适用于只有一个User和User的操作类，当再多一个类时就不适用了
 * @author cqs
 *
 */
public class Client {

	public static void main(String[] args) {
		IFactory iFactory = new SqlServerFactory();
//		IFactory iFactory = new AccessServerFactory();
		
		User u1 = new User();
		IUser iUser = iFactory.createUser();
		iUser.insert(u1);
		User userFromDb = iUser.getUser("");
		
		User u2 = new User();
		IUser iUser1 = iFactory.createUser();
		iUser1.insert(u2);
		User userFromDb1 = iUser1.getUser("");
		
		User u3 = new User();
		IUser iUser2 = iFactory.createUser();
		iUser2.insert(u3);
		User userFromDb2 = iUser2.getUser("");
		
		User u4 = new User();
		IUser iUser3 = iFactory.createUser();
		iUser3.insert(u4);
		User userFromDb3 = iUser3.getUser("");
		
		
		Department dpt = new Department();
		IDepartment idpt = iFactory.createDepartment();
		idpt.insert(dpt);
		Department dptFromDb = idpt.getDepartment("");
		
	}
}
