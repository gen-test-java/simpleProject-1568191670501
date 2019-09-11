package com.test.servicesImpl;
public interface UserService {

	User saveUser(User user);

	User findUserById(String userId);

	List<User> findAllUser();

	void deleteUserById(Long id);
}