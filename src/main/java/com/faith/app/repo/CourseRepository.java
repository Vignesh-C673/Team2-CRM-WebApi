package com.faith.app.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.entity.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {

}
