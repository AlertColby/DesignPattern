package main2;

/**
 * ��������ģʽ
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
//		User u = new User();
		//��������ֱ��new,��Ϊ����ദ��Ҫ����ô�죿
//		IUser iu = new SqlServerUser();
//		iu.insert(u);
//		iu.getUser("");
		
		//Ϊʲô�����������֮�����������?
		//��Ϊ���iFactory�������Դ�Ϊһ��ȫ�ֱ��������Ҫ�滻���ݿ⣬ֻ���滻��һ�д��뼴��
		IFactory iFactory = new SqlServerFactory();
//		IFactory iFactory = new AccessServerFactory();
		
		User u1 = new User();
		IUser iUser = iFactory.createUser();
		iUser.insert(u1);
		User userFromDb = iUser.getUser("");
		
		User u2 = new User();
		IUser iUser1 = iFactory.createUser();
		iUser1.insert(u2);
		User userFromDb1 = iUser.getUser("");
		
		User u3 = new User();
		IUser iUser2 = iFactory.createUser();
		iUser2.insert(u3);
		User userFromDb2 = iUser.getUser("");
		
		User u4 = new User();
		IUser iUser3 = iFactory.createUser();
		iUser3.insert(u4);
		User userFromDb3 = iUser.getUser("");
		
		
	}
}
