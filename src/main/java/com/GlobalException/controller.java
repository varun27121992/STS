package com.GlobalException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller {
	@Autowired
	Service2 ser;
	
	@PostMapping(value="/post")
	public String addWorker(@RequestBody worker w) throws NameException {
		return ser.addWorker(w);
				}

}
