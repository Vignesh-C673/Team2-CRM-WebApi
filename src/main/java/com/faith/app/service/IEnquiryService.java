package com.faith.app.service;

import java.util.List;

import java.util.Optional;

import com.faith.app.entity.Enquiry;

public interface IEnquiryService {
	
	//to get all the enquiry details
	List<Enquiry> getAllEnquiry();
	
	//to add the enquiry details
	void addEnquiry(Enquiry enquiry);
	
	//to search the enquiry by id
	Optional<Enquiry> searchEnqById(Integer id);
	

}
