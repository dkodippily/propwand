package com.thoughtwand.propwanduser.service;

import com.thoughtwand.propwanduser.domain.User;

public interface UserService {
	
	public void createUser(User user);

	public User findUserByEmail(String email);
}
