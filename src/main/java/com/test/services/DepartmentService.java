package com.test.services;
public interface DepartmentService {

	Department saveDepartment(Department department);

	Department findDepartmentById(String departmentId);

	List<Department> findAllDepartment();

	void deleteDepartmentById(Long id);
}