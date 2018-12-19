package main6;

import java.lang.reflect.Constructor;

/**
 * 使用配置文件和反射将上栗中的，简单工厂封装的抽象工厂模式再度封装，得到一个可以在线配置的抽象工厂
 * @author cqs
 *
 */
public class DataAccess {
	
	private static final String pack = "main6";

	public static IUser createUser(){
		IUser iUser = null;
		String db = PropertyUtil.getProperty("dbName");
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
		String db = PropertyUtil.getProperty("dbName");
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
