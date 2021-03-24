package com.faith.app.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Status {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int statusId;
	private String status;
	
	@OneToMany(mappedBy = "status")
	private List<Enquiry> enquiries;
	
	//getters and setters
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	@Override
	public String toString() {
		return "Status [statusId=" + statusId + ", status=" + status + "]";
	}
	
	
	
	
}
