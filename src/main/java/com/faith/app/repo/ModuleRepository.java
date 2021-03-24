package com.faith.app.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.entity.Module;

@Repository
public interface ModuleRepository extends CrudRepository<Module, Integer> {

}
