package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.entity.Course;
import com.faith.app.entity.Module;
import com.faith.app.entity.Qualification;
import com.faith.app.repo.CourseRepository;
import com.faith.app.repo.ModuleRepository;
import com.faith.app.repo.QualificationRepository;
@Service
public class CourseManagementService implements ICourseManagementService{

	@Autowired
	private CourseRepository courseRepository;
	
	//get all courses
	@Override
	public List<Course> getAllCourses(){
		return (List<Course>) courseRepository.findAll();
	}
	//get course by id
	@Override
	public Optional<Course> getCourseById(Integer id){
		return courseRepository.findById(id);
	}
	//add course
	@Override
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	//update course
	@Override
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}
	//delete course
	@Override
	public void deleteCourse(Integer id) {
		courseRepository.deleteById(id);
	}
	
	//module details------------
	@Autowired
	private ModuleRepository moduleRepository;
	
	//get all modules
	@Override
	public List<Module> getAllModules(){
		return (List<Module>) moduleRepository.findAll();
	}
	
	//qualification details
	@Autowired
	private QualificationRepository qualificationRepository;
	
	//get all qualifications
	@Override
	public List<Qualification> getAllQualifications(){
		return (List<Qualification>) qualificationRepository.findAll();
	}

	@Override
	public List<Course> getCourseByName(String coursename) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void disableCourse(Integer id) {
		courseRepository.disableCourse(id);
		
	}
	@Override
	public void enableCourse(Integer id) {
		courseRepository.enableCourse(id);
		
	}
}
