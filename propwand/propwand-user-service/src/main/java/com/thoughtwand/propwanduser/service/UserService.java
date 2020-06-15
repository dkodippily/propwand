package com.thoughtwand.propwanduser.service;

import com.thoughtwand.propwanduser.domain.User;

public interface UserService {
	
	public User createUser(User user);

	public User findUserByEmail(String email);
	
	public User findById(Long id);
}
