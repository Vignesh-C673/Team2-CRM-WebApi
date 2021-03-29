package com.faith.app.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.faith.app.entity.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {

	@Transactional
	@Modifying
	@Query("update Course set isActive=false where coursecode=?1")
	public void disableCourse(int id);
	
	@Transactional
	@Modifying
	@Query("update Course set isActive=true where coursecode=?1")
	public void enableCourse(int id);
	
	@Query("from Course where coursename like'%?1%'")
	public List<Course> searchByName(String coursename);
}
