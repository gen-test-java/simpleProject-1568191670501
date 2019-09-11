package com.test.entity;

import java.io.Serializable;
import javax.persistence.onetomany;
import javax.persistence.Entity;
import java.lang.Long;
import javax.persistence.Id;
import java.lang.String;

@Entity
public class Student implements Serializable {

	@JsonBackReference
	@JoinColumn(name = "department_id")
	@ManyToOne
	private Department department;

	@Id
	private long id;
	private String firstName;
	private String lastName;
	private String address;

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(final Department department) {
		this.department = department;
	}

	public long getId() {
		return this.id;
	}

	public void setId(final long id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}
}
