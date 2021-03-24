package com.faith.app.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.entity.TrainingAcademyUser;




@Repository
public interface UserRepository extends CrudRepository<TrainingAcademyUser, Integer> {

}
