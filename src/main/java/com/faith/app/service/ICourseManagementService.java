package com.faith.app.service;

import java.util.List;

import java.util.Optional;

import com.faith.app.entity.Course;
import com.faith.app.entity.Module;
import com.faith.app.entity.Qualification;

public interface ICourseManagementService {

	// get all courses
	List<Course> getAllCourses();

	// get course by id
	Optional<Course> getCourseById(Integer id);

	// add course
	void addCourse(Course course);

	// update course
	void updateCourse(Course course);

	// delete course
	void deleteCourse(Integer id);

	// get all modules
	List<Module> getAllModules();

	// get all qualifications
	List<Qualification> getAllQualifications();

	// to get course course using name
	List<Course> getCourseByName(String coursename);

	// to disable course details
	void disableCourse(Integer id);

	// to enable course details
	void enableCourse(Integer id);
}
