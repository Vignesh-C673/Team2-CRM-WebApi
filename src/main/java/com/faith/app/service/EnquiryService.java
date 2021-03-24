package com.faith.app.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.entity.Enquiry;
import com.faith.app.repo.EnquiryRepository;

@Service
public class EnquiryService implements IEnquiryService{

	@Autowired
	private EnquiryRepository enquiryRepository;
	
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

}
