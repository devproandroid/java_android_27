package com.devpro.training;

public class MainClass {

	public static void main(String[] args) {
		Address address = new Address();
		address.updateAddress("20", "17/19", "Nguyen Khanh Toan", "Quan Hoa", "Cau Giay", "Ha Noi");
		Student student = new Student(address);
		student.displayStudentInfor();
	}

}
