package com.faith.app.repo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.faith.app.entity.TrainingAcademyUser;

@Repository
public interface UserRepository extends CrudRepository<TrainingAcademyUser, Integer> {

	@Query("from TrainingAcademyUser where username=?1 and password=?2")
	TrainingAcademyUser findByUsernameAndPassword(String username, String password);
	
	@Transactional
	@Modifying
	@Query("update TrainingAcademyUser set isActive=false where user_id=?1")
	public void disableUser(int id);
	
	@Transactional
	@Modifying
	@Query("update TrainingAcademyUser set isActive=true where user_id=?1")
	public void enableUser(int id);
}
