package com.devpro.training;

public class StudentAccount {
	private String id;
	private String password;
	private Student student;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudentAccount [id=");
		builder.append(id);
		builder.append(", password=");
		builder.append(password);
		builder.append(", student=");
		builder.append(student);
		builder.append("]");
		return builder.toString();
	}

}
