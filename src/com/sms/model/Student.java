package com.sms.model;

public class Student {
	//Constructor using fields
	public Student(int studentId, String studentName, String email, String department, String phoneNumber) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.email = email;
		this.department = department;
		this.phoneNumber = phoneNumber;
	}
	/**
	 * POJO Class Format:
	 * 		-Plain Old Java Object
	 * 		-Format to follow:
	 * 			--> Declare variables in private
	 * 			--> Create parameterized constructor for the variables
	 * 			--> Create getter and setter methods(Encapsulation)
	 * 			--> Create toString() method
	 */
	
	private int studentId;
	private String studentName;
	private String email;
	private String department;
	private String phoneNumber; //2^31 - range
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	//Method overriding - toString()
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", email=" + email + ", department="
				+ department + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}

