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
@RequestMapping("/api/studentresource")
public class StudentResourceController {

	@Autowired
	private StudentResourceService studentResourceService;

	@GetMapping
	public ResponseEntity<?> getAllStudentResource() {
		try {
			List<StudentResource> studentResources = studentResourceService
					.findAllStudentResource();
			return new ResponseEntity<>(studentResources, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("StudentResource is Null.");
		}
	}

	@DeleteMapping
	public ResponseEntity<?> deleteStudentResource(@PathVariable Long id) {
		try {
			studentResourceService.deleteStudentResourceById(id);
			return new ResponseEntity<>("Deleted Successful", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("StudentResource is Deleted.");
		}
	}

	@PostMapping
	public ResponseEntity<?> saveStudentResource(
			@RequestBody StudentResource studentResource, BindingResult error) {
		if (errors.hasErrors()) {
			return new ResponseEntity<>(errors.toString(),
					HttpStatus.UNPROCESSABLE_ENTITY);
		}
		try {
			StudentResource studentResource = studentResourceService
					.saveStudentResource();
			return new ResponseEntity<>(studentResource, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("StudentResource could not be Saved.");
		}
	}
}