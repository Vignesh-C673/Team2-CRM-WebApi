package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.entity.TrainingAcademyUser;
import com.faith.app.repo.UserRepository;



@Service
public class UserService implements IUserService {
	
	@Autowired
	private UserRepository userRepository;

	//get all usesrs
	@Override
	public List<TrainingAcademyUser> getAllUsers() {
	
		return (List<TrainingAcademyUser>) userRepository.findAll();
	}
	
	//get user by id
	@Override
	public Optional<TrainingAcademyUser> getUserById(Integer id) {
	
		return userRepository.findById(id);
	}

	//add new user
	@Override
	public void addUser(TrainingAcademyUser user) {
		userRepository.save(user);

	}

	//updating user
	@Override
	public void updateUser(TrainingAcademyUser user) {
		userRepository.save(user);

	}

	//delete user
	@Override
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);

	}

}
