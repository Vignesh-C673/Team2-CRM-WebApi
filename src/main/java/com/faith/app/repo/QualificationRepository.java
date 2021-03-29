package com.faith.app.repo;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.faith.app.entity.Qualification;

@Repository
public interface QualificationRepository extends CrudRepository<Qualification, Integer> {

}
