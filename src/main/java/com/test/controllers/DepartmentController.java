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
@RequestMapping("/api/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@GetMapping
	public ResponseEntity<?> getAllDepartment() {
		try {
			List<Department> departments = departmentService
					.findAllDepartment();
			return new ResponseEntity<>(departments, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Department is Null.");
		}
	}

	@DeleteMapping
	public ResponseEntity<?> deleteDepartment(@PathVariable Long id) {
		try {
			departmentService.deleteDepartmentById(id);
			return new ResponseEntity<>("Deleted Successful", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Department is Deleted.");
		}
	}

	@PostMapping
	public ResponseEntity<?> saveDepartment(@RequestBody Department department,
			BindingResult error) {
		if (errors.hasErrors()) {
			return new ResponseEntity<>(errors.toString(),
					HttpStatus.UNPROCESSABLE_ENTITY);
		}
		try {
			Department department = departmentService.saveDepartment();
			return new ResponseEntity<>(department, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Department could not be Saved.");
		}
	}
}