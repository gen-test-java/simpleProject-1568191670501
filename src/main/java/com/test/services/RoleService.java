package com.test.servicesImpl;
public interface RoleService {

	Role saveRole(Role role);

	Role findRoleById(String roleId);

	List<Role> findAllRole();

	void deleteRoleById(Long id);
}