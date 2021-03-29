package com.faith.app.service;

import java.util.List;


import java.util.Optional;

import com.faith.app.entity.Enquiry;
import com.faith.app.entity.Status;
import com.faith.app.entity.StatusCount;

public interface IEnquiryService {
	
	List<StatusCount>getCount();
	
	//to get all status
	List<Status> getAllStatus();
	
	//to get all the enquiry details
	List<Enquiry> getAllEnquiry();
	
	//to add the enquiry details
	void addEnquiry(Enquiry enquiry);
	
	//to update enquiry
	void updateEnquiry(Enquiry enquiry);
	
	//to search the enquiry by id
	Optional<Enquiry> searchEnqById(Integer id);
	

}
