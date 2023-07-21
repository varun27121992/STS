package com.GlobalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(value=NameException.class)
	public ResponseEntity<String> get(NameException n) {
		return new ResponseEntity<String>("this name is not upto standard",HttpStatus.ACCEPTED);
		
	
	}

}
