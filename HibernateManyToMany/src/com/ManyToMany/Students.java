package com.ManyToMany;

import java.util.Set;

public class Students {
	private int Sid;
	private String Sname;
	private int Smark;
	private Set Course;
	
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getSmark() {
		return Smark;
	}
	public void setSmark(int smark) {
		Smark = smark;
	}
	public Set getCourse() {
		return Course;
	}
	public void setCourse(Set course) {
		Course = course;
	}
	 
	


}
