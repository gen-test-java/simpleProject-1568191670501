package com.test.servicesImpl;

import com.test.servicesImpl.StudentResourceService;
import org.springframework.stereotype.Service;
import com.test.repository.StudentResourceRepository;

@Service
public class StudentResourceServiceImpl implements StudentResourceService {

	StudentResourceRepository studentResourceRepository;

	@Override
	public StudentResource saveStudentResource(StudentResource studentResource) {
		return null;
	}

	@Override
	public StudentResource findStudentResourceById(String studentResourceId) {
		return null;
	}

	@Override
	public List<StudentResource> findAllStudentResource() {
		return null;
	}

	@Override
	public void deleteStudentResourceById(Long id) {
	}
}