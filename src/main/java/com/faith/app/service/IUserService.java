package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.faith.app.entity.TrainingAcademyUser;




public interface IUserService {
	
	//get all users
		List<TrainingAcademyUser> getAllUsers();

		//get user by id
		Optional<TrainingAcademyUser> getUserById(Integer id);

		//add users
		void addUser(TrainingAcademyUser user);

		//update user
		void updateUser(TrainingAcademyUser user);

		//delete user
		void deleteUser(Integer id);

}
