package main2;

public class AccessServerFactory implements IFactory {

	@Override
	public IUser createUser() {
		return new AccessServerUser();
	}

}
