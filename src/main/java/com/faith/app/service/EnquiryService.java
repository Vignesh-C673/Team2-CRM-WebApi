package com.faith.app.service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.entity.Enquiry;
import com.faith.app.entity.Status;
import com.faith.app.entity.StatusCount;
import com.faith.app.repo.EnquiryRepository;
import com.faith.app.repo.StatusRepository;

@Service
public class EnquiryService implements IEnquiryService{

	@Autowired
	private EnquiryRepository enquiryRepository;
	
	@Autowired
	private StatusRepository statusRepository;
	
	@Override
	public List<Enquiry> getAllEnquiry() {
		return (List<Enquiry>) enquiryRepository.findAll();
	}

	@Override
	public void addEnquiry(Enquiry enquiry) {
		enquiryRepository.save(enquiry);
	}

	@Override
	public  Optional<Enquiry> searchEnqById(Integer id) {
		return enquiryRepository.findById(id);
		
	}
	
	@Override
	public List<StatusCount> getCount() {
		return enquiryRepository.getCount();
	}

	@Override
	public List<Status> getAllStatus() {
		return (List<Status>) statusRepository.findAll();
	}

	@Override
	public void updateEnquiry(Enquiry enquiry) {
		enquiryRepository.save(enquiry);
		
	}

}
