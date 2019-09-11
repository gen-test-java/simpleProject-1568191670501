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
@RequestMapping("/api/role")
public class RoleController {

	@Autowired
	private RoleService roleService;

	@GetMapping
	public ResponseEntity<?> getAllRole() {
		try {
			List<Role> roles = roleService.findAllRole();
			return new ResponseEntity<>(roles, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Role is Null.");
		}
	}

	@DeleteMapping
	public ResponseEntity<?> deleteRole(@PathVariable Long id) {
		try {
			roleService.deleteRoleById(id);
			return new ResponseEntity<>("Deleted Successful", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Role is Deleted.");
		}
	}

	@PostMapping
	public ResponseEntity<?> saveRole(@RequestBody Role role,
			BindingResult error) {
		if (errors.hasErrors()) {
			return new ResponseEntity<>(errors.toString(),
					HttpStatus.UNPROCESSABLE_ENTITY);
		}
		try {
			Role role = roleService.saveRole();
			return new ResponseEntity<>(role, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Role could not be Saved.");
		}
	}
}