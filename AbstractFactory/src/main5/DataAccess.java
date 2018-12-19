package main5;

import java.lang.reflect.Constructor;

/**
 * ��������ģʽ���Ҫ����һ���ͻ���ʵ����Departmentʱ����Ҫ������Ӧ�Ĳ��������⣬����Ҫ�޸�IFactory��
 * AccessServerFactory��SqlServerFactory����������ֱ����һ���򵥹���ģʽ����װ,
 * ������Ҫ�޸�������ģ�����ֻ��Ҫ�������������һ���������ɡ�
 * ʹ�ü򵥹����ӷ��䣬�Ϳ��Ա���ÿ�������ж���swich����ˣ��������Ҫ��ΪOrical,ֻ������OricalUser , 
 * OricalDepartment,���޸�DataAccess��dbΪOrical���ɣ��ͻ��˴��벻���޸�
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
