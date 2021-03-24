package com.faith.app.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.entity.Enquiry;
@Repository
public interface EnquiryRepository extends CrudRepository<Enquiry, Integer>{ 

}
