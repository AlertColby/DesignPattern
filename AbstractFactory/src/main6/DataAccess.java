package main6;

import java.lang.reflect.Constructor;

/**
 * ʹ�������ļ��ͷ��佫�����еģ��򵥹�����װ�ĳ��󹤳�ģʽ�ٶȷ�װ���õ�һ�������������õĳ��󹤳�
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
