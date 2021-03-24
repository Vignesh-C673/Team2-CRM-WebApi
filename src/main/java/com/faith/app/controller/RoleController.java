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

import com.faith.app.entity.TrainingAcademyRole;
import com.faith.app.service.IRoleService;




@CrossOrigin
@RestController
@RequestMapping("/api")
public class RoleController {

	@Autowired
	private IRoleService roleservice;

	// get all roles
	@GetMapping("/trole")
	public List<TrainingAcademyRole> getAllRole() {
		return roleservice.getAllRoles();

	}

	// add role
	@PostMapping("/trole/addNew")
	public void addUser(@RequestBody TrainingAcademyRole role) {
		roleservice.addRole(role);
	}

	// get role by id
	@GetMapping("/trole/{id}")
	public Optional<TrainingAcademyRole> getRoleById(@PathVariable Integer id) {
		return roleservice.getRoleById(id);
	}

	// update role
	@PutMapping("/trole/{id}/update")
	public void updateRole(@RequestBody TrainingAcademyRole role) {
		roleservice.updateRole(role);
	}

	// delete user
	@DeleteMapping("/trole/{id}/delete")
	public void deleteRole(@PathVariable Integer id) {
		roleservice.deleteRole(id);
	}

}
