package com.test.servicesImpl;

import com.test.servicesImpl.RoleService;
import org.springframework.stereotype.Service;
import com.test.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

	RoleRepository roleRepository;

	@Override
	public Role saveRole(Role role) {
		return null;
	}

	@Override
	public Role findRoleById(String roleId) {
		return null;
	}

	@Override
	public List<Role> findAllRole() {
		return null;
	}

	@Override
	public void deleteRoleById(Long id) {
	}
}