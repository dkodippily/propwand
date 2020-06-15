package com.thoughtwand.propwanduser.service.iml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtwand.propwanduser.domain.User;
import com.thoughtwand.propwanduser.repository.UserRepository;
import com.thoughtwand.propwanduser.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User findUserByEmail(String email) {
		return userRepository.findUserByEmail(email);
	}

	@Override
	public User findById(Long id) {
		return userRepository.findById(id).get();
	}

}
