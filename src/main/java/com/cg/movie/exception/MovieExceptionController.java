package com.cg.movie.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/****************************
 *          @author          Javvadi Sai Krishna
 *          Description      It is a Exception class that throws exceptions raised for the entity 
  *         Version             1.0
  *         Created Date    21-APR-2020
 ****************************/
@RestControllerAdvice
public class MovieExceptionController {
	
	@ExceptionHandler(value = MovieException.class)
	public ResponseEntity<Object> handleException(MovieException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}

}
