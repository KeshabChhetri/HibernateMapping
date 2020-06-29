package com.ManyToMany;

import java.util.Set;

public class Course {
	private int Cid;
	private String Cname;
	private int Cduration;
	private Set Students;
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public int getCduration() {
		return Cduration;
	}
	public void setCduration(int cduration) {
		Cduration = cduration;
	}
	public Set getStudents() {
		return Students;
	}
	public void setStudents(Set students) {
		Students = students;
	}
	

}
