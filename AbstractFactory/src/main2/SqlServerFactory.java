package main2;

public class SqlServerFactory implements IFactory {

	@Override
	public IUser createUser() {
		// TODO Auto-generated method stub
		return new SqlServerUser();
	}

}
