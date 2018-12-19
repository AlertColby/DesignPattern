package main5;

import main3.bean.Department;
import main3.bean.User;

/**
 * ��������ģʽ���Ҫ����һ���ͻ���ʵ����Departmentʱ����Ҫ������Ӧ�Ĳ��������⣬����Ҫ�޸�IFactory��
 * AccessServerFactory��SqlServerFactory����������ֱ����һ���򵥹���ģʽ����װ,
 * ������Ҫ�޸�������ģ�����ֻ��Ҫ�������������һ���������ɡ�
 * ʹ�ü򵥹����ӷ��䣬�Ϳ��Ա���ÿ�������ж���swich����ˣ��������Ҫ��ΪOrical,ֻ������OricalUser , 
 * OricalDepartment,���޸�DataAccess��dbΪOrical���ɣ��ͻ��˴��벻���޸�
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
