package com.faith.app.service;

import java.util.List;

import java.util.Optional;

import com.faith.app.entity.TrainingAcademyRole;

public interface IRoleService {

	// add roles
	void addRole(TrainingAcademyRole role);

	// update role
	void updateRole(TrainingAcademyRole role);

	// delete role
	void deleteRole(Integer id);

	// view all roles
	List<TrainingAcademyRole> getAllRoles();

	// get role by id
	Optional<TrainingAcademyRole> getRoleById(Integer id);

}
