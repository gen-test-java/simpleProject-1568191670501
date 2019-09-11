package com.test.servicesImpl;

import com.test.services.DepartmentService;
import org.springframework.stereotype.Service;
import com.test.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		return null;
	}

	@Override
	public Department findDepartmentById(String departmentId) {
		return null;
	}

	@Override
	public List<Department> findAllDepartment() {
		return null;
	}

	@Override
	public void deleteDepartmentById(Long id) {
	}
}