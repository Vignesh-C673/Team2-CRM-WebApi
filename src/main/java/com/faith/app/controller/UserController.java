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

import com.faith.app.entity.TrainingAcademyUser;
import com.faith.app.service.IUserService;




@CrossOrigin
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private IUserService userService;

	// get all users
	@GetMapping("/tusers")
	public List<TrainingAcademyUser> getAllusers() {
		return userService.getAllUsers();
	}

	// get user by id
	@GetMapping("/tusers/{id}")
	public Optional<TrainingAcademyUser> getUserById(@PathVariable Integer id) {
		return userService.getUserById(id);
	}

	// get post by user id

	// add user
	@PostMapping("/tusers/addNew")
	public void addUser(@RequestBody TrainingAcademyUser user) {
		userService.addUser(user);
	}

	// update user
	@PutMapping("/tusers/{id}/update")
	public void updateUser(@RequestBody TrainingAcademyUser user) {
		userService.updateUser(user);
	}

	// delete user
	@DeleteMapping("/tusers/{id}/delete")
	public void deleteUser(@PathVariable Integer id) {

		userService.deleteUser(id);
	}

}
