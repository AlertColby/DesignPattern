package main4;

/**
 * ��������ģʽ���Ҫ����һ���ͻ���ʵ����Departmentʱ����Ҫ������Ӧ�Ĳ��������⣬����Ҫ�޸�IFactory��
 * AccessServerFactory��SqlServerFactory����������ֱ����һ���򵥹���ģʽ����װ,
 * ������Ҫ�޸�������ģ�����ֻ��Ҫ�������������һ���������ɡ�
 * @author cqs
 *
 */
public class DataAccess {
	
//	private static final String db = "SqlServer";
	private static final String db = "Access";

	public static IUser createUser(){
		IUser iUser = null;
		switch (db) {
		case "SqlServer":
			iUser = new SqlServerUser();
			break;
		case "Access":
			iUser = new AccessServerUser();
			break;
		default:
			break;
		}
		return iUser;
	}
	
	public static IDepartment createDepartment(){
		IDepartment idpt = null;
		switch (db) {
		case "SqlServer":
			idpt = new SqlServerDepartment();
			break;
		case "Access":
			idpt = new AccessServerDepartment();
			break;
		default:
			break;
		}
		return idpt;
	}
}
