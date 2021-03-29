package com.faith.app.repo;


import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.faith.app.entity.Enquiry;
import com.faith.app.entity.StatusCount;
@Repository
public interface EnquiryRepository extends CrudRepository<Enquiry, Integer>{ 

	@Transactional
	@Modifying
	@Query("select new com.faith.app.entity.StatusCount(e.status.statusId,count(e))from Enquiry e group by e.status.statusId") 
	public List<StatusCount> getCount();
}
