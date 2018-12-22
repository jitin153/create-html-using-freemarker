package com.jitin.createhtmlwithfreemarker.model;
import java.util.List;

public class College {
	private Long collegeId;
	private String collegeName;
	private Address collegeAddress;
	private List<Student> students;

	public College() {

	}

	public College(Long collegeId, String collegeName, Address collegeAddress, List<Student> students) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
		this.students = students;
	}

	public Long getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Address getCollegeAddress() {
		return collegeAddress;
	}

	public void setCollegeAddress(Address collegeAddress) {
		this.collegeAddress = collegeAddress;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
