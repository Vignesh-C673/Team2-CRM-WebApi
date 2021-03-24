package com.faith.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="tRole")
public class TrainingAcademyRole {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int role_id;
	
	private String role_name;
	
	//one role may users
//	@OneToMany(mappedBy="role" ,cascade=CascadeType.ALL)
//	private List<TrainingAcademyUser> tUsers;

	public TrainingAcademyRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TrainingAcademyRole(int role_id, String role_name, List<TrainingAcademyUser> tUsers) {
		super();
		this.role_id = role_id;
		this.role_name = role_name;
//		this.tUsers = tUsers;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

//	@JsonManagedReference
//	public List<TrainingAcademyUser> gettUsers() {
//		return tUsers;
//	}
//
//	public void settUsers(List<TrainingAcademyUser> tUsers) {
//		this.tUsers = tUsers;
//	}
	
	
	
	
	

}
