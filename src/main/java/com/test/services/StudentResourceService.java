package com.test.servicesImpl;
public interface StudentResourceService {

	StudentResource saveStudentResource(StudentResource studentResource);

	StudentResource findStudentResourceById(String studentResourceId);

	List<StudentResource> findAllStudentResource();

	void deleteStudentResourceById(Long id);
}