package com.test.servicesImpl;

import com.test.servicesImpl.UserService;
import org.springframework.stereotype.Service;
import com.test.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		return null;
	}

	@Override
	public User findUserById(String userId) {
		return null;
	}

	@Override
	public List<User> findAllUser() {
		return null;
	}

	@Override
	public void deleteUserById(Long id) {
	}
}