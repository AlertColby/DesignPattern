package main;

/**
 * һ����÷�ʽ
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		User u = new User();
//		SqlServerUser sqlServerUser = new SqlServerUser();
//		sqlServerUser.insert(u);
//		sqlServerUser.getUser("1");
		
		AccessServerUser accessServerUser = new AccessServerUser();
		accessServerUser.insert(u);
		accessServerUser.getUser("");
	}
}
