package com.GlobalException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {
	@Autowired
	Repository2 repo;
	public String addWorker(worker w) {
		repo.save(w);
		return "Successfully saved";
	
}
}

