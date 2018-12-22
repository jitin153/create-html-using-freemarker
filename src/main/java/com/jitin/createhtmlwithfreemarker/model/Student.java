package com.jitin.createhtmlwithfreemarker.model;

public class Student {
	private Long rollNumber;
	private String studentName;
	private String course;
	private Boolean isPass;
	private Address studentAddress;

	public Student() {

	}

	public Student(Long rollNumber, String studentName, String course, Boolean isPass, Address studentAddress) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.course = course;
		this.isPass = isPass;
		this.studentAddress = studentAddress;
	}

	public Long getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Long rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Boolean getIsPass() {
		return isPass;
	}

	public void setIsPass(Boolean isPass) {
		this.isPass = isPass;
	}

	public Address getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

}
