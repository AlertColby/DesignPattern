package main5;

import main3.bean.Department;
import main3.bean.User;

/**
 * 工厂方法模式如果要增加一个客户端实例如Department时除了要增加相应的操作代码外，还需要修改IFactory，
 * AccessServerFactory，SqlServerFactory，所以这里直接用一个简单工厂模式做封装,
 * 本来需要修改三个类的，现在只需要在这个类中增加一个方法即可。
 * 使用简单工厂加反射，就可以避免每个方法中都有swich语句了，现在如果要改为Orical,只需增加OricalUser , 
 * OricalDepartment,并修改DataAccess中db为Orical即可，客户端代码不用修改
 * @author cqs
 *
 */
public class Client {

	public static void main(String[] args) {
		User u1 = new User();
		IUser iUser = DataAccess.createUser();
		iUser.insert(u1);
		User userFromDb = iUser.getUser("");
		
		User u2 = new User();
		IUser iUser1 = DataAccess.createUser();
		iUser1.insert(u2);
		User userFromDb1 = iUser1.getUser("");
		
		User u3 = new User();
		IUser iUser2 = DataAccess.createUser();
		iUser2.insert(u3);
		User userFromDb2 = iUser2.getUser("");
		
		User u4 = new User();
		IUser iUser3 = DataAccess.createUser();
		iUser3.insert(u4);
		User userFromDb3 = iUser3.getUser("");
		
		Department dpt = new Department();
		IDepartment idpt = DataAccess.createDepartment();
		idpt.insert(dpt);
		Department dptFromDb = idpt.getDepartment("");
		
	}
}
