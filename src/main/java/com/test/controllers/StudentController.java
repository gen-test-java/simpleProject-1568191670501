package com.test.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping
	public ResponseEntity<?> getAllStudent() {
		try {
			List<Student> students = studentService.findAllStudent();
			return new ResponseEntity<>(students, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Student is Null.");
		}
	}

	@DeleteMapping
	public ResponseEntity<?> deleteStudent(@PathVariable Long id) {
		try {
			studentService.deleteStudentById(id);
			return new ResponseEntity<>("Deleted Successful", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Student is Deleted.");
		}
	}

	@PostMapping
	public ResponseEntity<?> saveStudent(@RequestBody Student student,
			BindingResult error) {
		if (errors.hasErrors()) {
			return new ResponseEntity<>(errors.toString(),
					HttpStatus.UNPROCESSABLE_ENTITY);
		}
		try {
			Student student = studentService.saveStudent();
			return new ResponseEntity<>(student, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Student could not be Saved.");
		}
	}
}