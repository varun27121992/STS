package com.GlobalException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service2 {
	@Autowired
	Dao2 dao;
	
	public String addWorker(worker w) throws NameException{
		if(w.getName().length()<6) {
			throw new NameException("its too short");
		}
		else {
		return dao.addWorker(w);
	}
}
}