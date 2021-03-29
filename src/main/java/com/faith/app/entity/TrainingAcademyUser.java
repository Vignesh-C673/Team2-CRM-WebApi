package com.faith.app.entity;

import java.util.Date;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TrUser")
public class TrainingAcademyUser {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int user_id;
	
	private String firstname;
	private String lastname;
	private Date dob;
	private String mobile;
	private String email;
	private String address;
	private int pincode;
	private String username;
	private String password;
	private String image;
	private int roleid;
	
	private boolean isActive=true;
	
	//may users one role
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="roleid", updatable=false, insertable=false)
	private TrainingAcademyRole role;

	public TrainingAcademyUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TrainingAcademyUser(int user_id, String firstname, String lastname, Date dob, String mobile, String email,
			String address, int pincode, String username, String password, String image, 
			TrainingAcademyRole tRoles,boolean isActive) {
		super();
		this.user_id = user_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.pincode = pincode;
		this.username = username;
		this.password = password;
		this.image = image;
		this.role = tRoles;
		this.isActive=true;
	}

	
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

//	@JsonBackReference
	public TrainingAcademyRole getRole() {
		return role;
	}

	public void setRole(TrainingAcademyRole role) {
		this.role = role;
	}

	
	
	
	
	
	
	
	

}
