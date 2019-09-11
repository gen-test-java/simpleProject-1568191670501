package com.test.servicesImpl;
public interface StudentService {

	Student saveStudent(Student student);

	Student findStudentById(String studentId);

	List<Student> findAllStudent();

	void deleteStudentById(Long id);
}