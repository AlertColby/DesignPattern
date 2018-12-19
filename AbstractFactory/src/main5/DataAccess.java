package main5;

import java.lang.reflect.Constructor;

/**
 * 工厂方法模式如果要增加一个客户端实例如Department时除了要增加相应的操作代码外，还需要修改IFactory，
 * AccessServerFactory，SqlServerFactory，所以这里直接用一个简单工厂模式做封装,
 * 本来需要修改三个类的，现在只需要在这个类中增加一个方法即可。
 * 使用简单工厂加反射，就可以避免每个方法中都有swich语句了，现在如果要改为Orical,只需增加OricalUser , 
 * OricalDepartment,并修改DataAccess中db为Orical即可，客户端代码不用修改
 * @author cqs
 *
 */
public class DataAccess {
	
	private static final String pack = "main5";
//	private static final String db = "SqlServer";
	private static final String db = "AccessServer";

	public static IUser createUser(){
		IUser iUser = null;
		String className = pack + "." + db + "User"; 
		try{
			Class cls = Class.forName(className);
			Constructor<IUser> cons = cls.getConstructor();
			iUser = cons.newInstance();
		}catch(Exception e){
			e.printStackTrace();
		}
		return iUser;
	}
	
	public static IDepartment createDepartment(){
		IDepartment idpt = null;
		String className = pack + "." + db + "Department";
		try{
			Class cls = Class.forName(className);
			Constructor<IDepartment> cons = cls.getConstructor();
			idpt = cons.newInstance();
		}catch(Exception e){
			e.printStackTrace();
		}
		return idpt;
	}
}
