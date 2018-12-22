package com.jitin.createhtmlwithfreemarker.model;

import java.util.Date;
import java.util.List;

public class Wrapper {

	private Date currentDate;
	private String title;
	private List<College> colleges;

	public Wrapper() {

	}

	public Wrapper(Date currentDate, String title, List<College> colleges) {
		super();
		this.currentDate = currentDate;
		this.title = title;
		this.colleges = colleges;
	}

	public Date getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<College> getColleges() {
		return colleges;
	}

	public void setColleges(List<College> colleges) {
		this.colleges = colleges;
	}

}
