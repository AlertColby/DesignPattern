package main4;

/**
 * 工厂方法模式如果要增加一个客户端实例如Department时除了要增加相应的操作代码外，还需要修改IFactory，
 * AccessServerFactory，SqlServerFactory，所以这里直接用一个简单工厂模式做封装,
 * 本来需要修改三个类的，现在只需要在这个类中增加一个方法即可。
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
