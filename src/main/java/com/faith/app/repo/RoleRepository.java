package com.faith.app.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.entity.TrainingAcademyRole;



@Repository
public interface RoleRepository extends CrudRepository<TrainingAcademyRole, Integer> {

}
