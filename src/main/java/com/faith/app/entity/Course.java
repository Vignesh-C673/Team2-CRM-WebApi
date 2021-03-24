package com.faith.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int coursecode;
	private String coursename, description;
	private int duration;
	private double fees;
	private boolean isActive;

	// from enquiry
	@ManyToMany(targetEntity = Enquiry.class, cascade = CascadeType.ALL)
	private List<Enquiry> courseEnquiries;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "course_quals", joinColumns = {
			@JoinColumn(name = "coursecode", referencedColumnName = "coursecode", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "qualid", referencedColumnName = "qualid", nullable = false, updatable = false) })
	private List<Qualification> qualifications;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "course_mods", joinColumns = {
			@JoinColumn(name = "coursecode", referencedColumnName = "coursecode", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "modid", referencedColumnName = "modid", nullable = false, updatable = false) })
	private List<Module> modules;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int coursecode, String coursename, String description, int duration, double fees,
			List<Qualification> qualifications, List<Module> modules, boolean isActive) {
		super();
		this.coursecode = coursecode;
		this.coursename = coursename;
		this.description = description;
		this.duration = duration;
		this.fees = fees;
		this.qualifications = qualifications;
		this.modules = modules;
		this.isActive = isActive;
	}

	public int getCoursecode() {
		return coursecode;
	}

	public void setCoursecode(int coursecode) {
		this.coursecode = coursecode;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@JsonManagedReference
	public List<Qualification> getQualifications() {
		return qualifications;
	}

	public void setQualifications(List<Qualification> qualifications) {
		this.qualifications = qualifications;
	}

	@JsonManagedReference
	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	@Override
	public String toString() {
		return "Course [coursecode=" + coursecode + ", coursename=" + coursename + ", description=" + description
				+ ", duration=" + duration + ", fees=" + fees + ", qualifications=" + qualifications + ", modules="
				+ modules + "]";
	}

}
