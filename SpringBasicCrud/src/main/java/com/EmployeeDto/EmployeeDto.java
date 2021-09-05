package com.EmployeeDto;

public class EmployeeDto {

	private int id;
	private String firstname;
	private String lastname;
	private int sal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public EmployeeDto(int id, String firstname, String lastname, int sal) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.sal = sal;
	}

	public EmployeeDto() {
		super();
	}

}
