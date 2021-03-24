package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.entity.TrainingAcademyRole;
import com.faith.app.repo.RoleRepository;


@Service
public class RoleService implements IRoleService {

	@Autowired
	private RoleRepository roleRepository;

	// add new roles
	@Override
	public void addRole(TrainingAcademyRole role) {

		roleRepository.save(role);

	}

	// update roles
	@Override
	public void updateRole(TrainingAcademyRole role) {

		roleRepository.save(role);
	}

	// delete role
	@Override
	public void deleteRole(Integer id) {
		roleRepository.deleteById(id);

	}

	// get all roles
	@Override
	public List<TrainingAcademyRole> getAllRoles() {

		return (List<TrainingAcademyRole>) roleRepository.findAll();
	}

	// get all role by id
	@Override
	public Optional<TrainingAcademyRole> getRoleById(Integer id) {

		return roleRepository.findById(id);
	}

}
