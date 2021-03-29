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
import com.faith.app.entity.Qualification;
import com.faith.app.entity.Module;
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
		@PutMapping("/courses/update")
		public void updateCourse(@RequestBody Course course) {
			courseService.updateCourse(course);
		}
		
		//delete course
		@DeleteMapping("/courses/ {id}/delete")
		public void deleteCourse(@PathVariable Integer id) {
			courseService.deleteCourse(id);
		}
		
		@GetMapping("/quals")
		public List<Qualification> getAllQual() {
			return courseService.getAllQualifications();
		}

		@GetMapping("/modules")
		public List<Module> getAllMod() {
			return courseService.getAllModules();
		}

		// disable course
		@PutMapping("/courses/disable/{id}")
		public void disableCourse(@PathVariable Integer id) {
			courseService.disableCourse(id);
		}

		// enable course
		@PutMapping("/courses/enable/{id}")
		public void enableCourse(@PathVariable Integer id) {
			courseService.enableCourse(id);
		}

		// get course by id
		@GetMapping("/courses/{coursename}")
		public List<Course> getCourseByName(@PathVariable String coursename) {
			return courseService.getCourseByName(coursename);
		}
}
