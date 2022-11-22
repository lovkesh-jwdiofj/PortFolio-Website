package com.pojo;

public class Experience {
	
	
	
	private int year;
	private String title;
	private String subtitle;
	private String description;
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Education [year=" + year + ", title=" + title + ", subtitle=" + subtitle + ", description="
				+ description + "]";
	}
	
	
	

}
