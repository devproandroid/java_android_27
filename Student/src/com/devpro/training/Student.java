package com.devpro.training;

public class Student {
	private String studentName;
	private String studentId;
	private int age;
	public Address address;
	public Department department;
	public Subject subject;
	
	public Student() {
		
	}

	public Student(Address address) {
		this.address = address;
	}

	public void displayStudentInfor() {
		System.out.println("=============================| Student Infor |=============================");
		System.out.println("Full name: " + getStudentName());
		System.out.println("Age: " + getAge());
		System.out.println(
				"Address: " + address.getNumber() + ", " + address.getAlley() + ", " + address.getStreetName() + ", "
						+ address.getWardName() + ", " + address.getDistrictName() + ", " + address.getCityName());
		System.out.println("=============================| +++++++++++++ |=============================");
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
