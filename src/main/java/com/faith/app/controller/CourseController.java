package com.faith.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.Course;
import com.faith.app.service.ICourseManagementService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class CourseController {
	
		@Autowired
		private ICourseManagementService courseService;
		
		//get all courses
		@GetMapping("/courses")
		public List<Course> getAllCourses(){
			return courseService.getAllCourses();
		}
		
		//get course by id
		@GetMapping("/courses/{id}")
		public Optional<Course> getCourseById(@PathVariable Integer id){
			return courseService.getCourseById(id);
		}
		
		//add course
		@PostMapping("/courses/add")
		public void addCourse(@RequestBody Course course) {
			courseService.addCourse(course);
		}
		//update course
		@PutMapping("/courses/{id}/update")
		public void updateCourse(@RequestBody Course course) {
			courseService.updateCourse(course);
		}
		
		//delete course
		@DeleteMapping("/courses/ {id}/delete")
		public void deleteCourse(@PathVariable Integer id) {
			courseService.deleteCourse(id);
		}
}
