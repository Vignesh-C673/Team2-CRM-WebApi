package com.faith.app.controller;

import java.util.List;


import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private IUserService userService;

	// get all users
		@GetMapping("/tusers")
		public List<TrainingAcademyUser> getAllusers() {
			logger.info("your message");
			
			 userService.getAllUsers();
			
			return userService.getAllUsers();
		}

		// get user by id
		@GetMapping("/tusers/{id}")
		public Optional<TrainingAcademyUser> getUserById(@PathVariable Integer id) {
			
			return userService.getUserById(id);
		}



		// add user
		@PostMapping("/tusers/add")
		public TrainingAcademyUser addUser(@RequestBody TrainingAcademyUser user) {
			
			//user.setUser_id(user.getUser_id());
			
			userService.addUser(user);
			return user;
		}

		// update user
		@PutMapping("/tusers/{id}/update")
		public void updateUser(@RequestBody TrainingAcademyUser user) {
			userService.updateUser(user);
		}

		// delete user
		@PutMapping("/tusers/disable/{id}")
		public void disableUser(@PathVariable Integer id) {

			userService.disableUser(id);
		}

		//enable user
		@PutMapping("/tusers/enable/{id}")
		public void enableUser(@PathVariable Integer id) {
			userService.enableUser(id);
		}
		
		
		@GetMapping("user-login/{username}&{password}")
		public ResponseEntity<TrainingAcademyUser> listUser(@PathVariable("username") String username,
				@PathVariable("password") String password) {

			ResponseEntity<TrainingAcademyUser> response = null;
			TrainingAcademyUser user = userService.findUser(username, password);
			if (user == null) {
				response = new ResponseEntity<TrainingAcademyUser>(HttpStatus.NOT_FOUND);
			} else {
				response = new ResponseEntity<TrainingAcademyUser>(user, HttpStatus.OK);
			}

			return response;

		}

}
