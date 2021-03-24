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
public class Module {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int modid;
	private String modname;
	
	@ManyToMany(mappedBy = "modules", fetch = FetchType.LAZY)
	private List<Course> courses;
	
	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Module(int modid, String modname) {
		super();
		this.modid = modid;
		this.modname = modname;
	}
	
	public int getModid() {
		return modid;
	}
	public void setModid(int modid) {
		this.modid = modid;
	}
	public String getModname() {
		return modname;
	}
	public void setModname(String modname) {
		this.modname = modname;
	}
	
	@JsonBackReference
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Module [modid=" + modid + ", modname=" + modname + "]";
	}
}
