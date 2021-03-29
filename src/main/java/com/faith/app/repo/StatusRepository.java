package com.faith.app.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.entity.Status;

@Repository
public interface StatusRepository extends CrudRepository<Status, Integer>{

}
