package com.project.election.exceptionhandler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.project.election.domain.ApiResponse;

@ControllerAdvice
public class ExceptionManager {

	@ExceptionHandler
	public ResponseEntity<ApiResponse> handleNotFoundException(NotFoundException nfe) {
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setDate(new Date());
		apiResponse.setMessage(nfe.getMessage());
		apiResponse.setOk(false);
		ResponseEntity<ApiResponse> response = new ResponseEntity(apiResponse, HttpStatus.BAD_REQUEST);
		return response;

	}

}
