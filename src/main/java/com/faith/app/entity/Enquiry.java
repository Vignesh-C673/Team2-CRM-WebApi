package com.faith.app.entity;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Enquiry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int enqid;
	private String enqName;
	private LocalDate dob;
	private String email;
	private long mobile;
	private String address;
	private String highestQual;
	private double percent;
	private Year yearOfPass;
	private LocalDate enqDate;
	@JoinColumn
	@ManyToOne(cascade = CascadeType.ALL)
	private Status status;

	@ManyToMany(targetEntity = Course.class, cascade = CascadeType.ALL, mappedBy = "courseEnquiries")
	private List<Course> enquiredCourse;

	
	public Enquiry() {
		super();
		// TODO Auto-generated constructor stub
	}

	// constructor
	public Enquiry(int enqid, String enqName, LocalDate dob, String email, long mobile, String address,
			String highestQual, double percent, Year yearOfPass, LocalDate enqDate, int statusID,
			List<Course> enquiredCourse) {
		super();
		this.enqid = enqid;
		this.enqName = enqName;
		this.dob = dob;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.highestQual = highestQual;
		this.percent = percent;
		this.yearOfPass = yearOfPass;
		this.enqDate = enqDate;
		this.enquiredCourse = enquiredCourse;
	}

	// getters and setters
	public int getEnqid() {
		return enqid;
	}

	public void setEnqid(int enqid) {
		this.enqid = enqid;
	}

	public String getEnqName() {
		return enqName;
	}

	public void setEnqName(String enqName) {
		this.enqName = enqName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHighestQual() {
		return highestQual;
	}

	public void setHighestQual(String highestQual) {
		this.highestQual = highestQual;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	public Year getYearOfPass() {
		return yearOfPass;
	}

	public void setYearOfPass(Year yearOfPass) {
		this.yearOfPass = yearOfPass;
	}

	public LocalDate getEnqDate() {
		return enqDate;
	}

	public void setEnqDate(LocalDate enqDate) {
		this.enqDate = enqDate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<Course> getEnquiredCourse() {
		return enquiredCourse;
	}

	public void setEnquiredCourse(List<Course> enquiredCourse) {
		this.enquiredCourse = enquiredCourse;
	}

	@Override
	public String toString() {
		return "Enquiry [enqid=" + enqid + ", enqName=" + enqName + ", dob=" + dob + ", email=" + email + ", mobile="
				+ mobile + ", address=" + address + ", highestQual=" + highestQual + ", percent=" + percent
				+ ", yearOfPass=" + yearOfPass + ", enqDate=" + enqDate + ", status=" + status + ", enquiredCourse="
				+ enquiredCourse + "]";
	}

}
