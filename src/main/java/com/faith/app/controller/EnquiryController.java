package com.faith.app.controller;

import java.util.List;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.Enquiry;
import com.faith.app.entity.Status;
import com.faith.app.entity.StatusCount;
import com.faith.app.service.IEnquiryService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class EnquiryController {
    
	@Autowired
	private IEnquiryService enquiryService;
	
	@GetMapping("/status/count")
	List<StatusCount>getStatusCount(){		
		return enquiryService.getCount();
	}
	
	@GetMapping("/status")
	public List<Status> getAllStatus(){
		return enquiryService.getAllStatus();
	}
	
	@GetMapping("/enquiry")
	public List<Enquiry> getAllEnqyuiry(){
		return enquiryService.getAllEnquiry();
	}
		
	@GetMapping("/enquiry/{id}")
	public Optional<Enquiry> getCourseById(@PathVariable Integer id){
		return enquiryService.searchEnqById(id);
	}
	
	@PostMapping("/enquiry/add")
	public void addEnquiry(@RequestBody Enquiry enquiry) {
		enquiryService.addEnquiry(enquiry);
	}
	
	@PutMapping("/enquiry/update")
	public void updateEnquiry(@RequestBody Enquiry enquiry) {
		enquiryService.updateEnquiry(enquiry);
	}
		
}
