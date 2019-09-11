package com.test.servicesImpl;

import com.test.servicesImpl.StudentService;
import org.springframework.stereotype.Service;
import com.test.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		return null;
	}

	@Override
	public Student findStudentById(String studentId) {
		return null;
	}

	@Override
	public List<Student> findAllStudent() {
		return null;
	}

	@Override
	public void deleteStudentById(Long id) {
	}
}