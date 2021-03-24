package com.faith.app.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Qualification {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int qualid;
	private String qualname;
	
	@ManyToMany(mappedBy = "qualifications", fetch = FetchType.LAZY)
	private List<Course> courses;
	
	public Qualification() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Qualification(int qualid, String qualname) {
		super();
		this.qualid = qualid;
		this.qualname = qualname;
	}

	public int getQualid() {
		return qualid;
	}
	public void setQualid(int qualid) {
		this.qualid = qualid;
	}
	public String getQualname() {
		return qualname;
	}
	public void setQualname(String qualname) {
		this.qualname = qualname;
	}

	@JsonBackReference
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourseQualifications(List<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Qualification [qualid=" + qualid + ", qualname=" + qualname + "]";
	}
	
}
