package main3;

import main3.bean.User;

public interface IUser {

	void insert(User user);
	
	User getUser(String id);
}
