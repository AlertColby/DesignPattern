package main3;

public class AccessServerFactory implements IFactory {

	@Override
	public IUser createUser() {
		return new AccessServerUser();
	}

	@Override
	public IDepartment createDepartment() {
		// TODO Auto-generated method stub
		return new AccessServerDepartment();
	}

}
