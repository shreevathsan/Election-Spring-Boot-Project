package com.project.election.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.election.domain.LoginStatus;
import com.project.election.domain.UserDomain;
import com.project.election.entity.MasterCity;
import com.project.election.entity.User;
import com.project.election.exceptionhandler.NotFoundException;
import com.project.election.service.MasterCityService;
import com.project.election.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	private static final Logger logger = LogManager.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	private final MasterCityService masterCityService;

	@Autowired
	public UserController(MasterCityService masterCityService) {
		this.masterCityService = masterCityService;
	}

	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@RequestBody UserDomain userDomain) {
		logger.info("got the request from the user to register" + userDomain.getFirstName());
		logger.info("about to call the MASTER CITY REPO to get the city by passing id" + userDomain.getCity());
		MasterCity masterCity = masterCityService.getCityById(userDomain.getCity());
		logger.info("::::::::::::::::" + masterCity);
		User user = new User();

		user.setFirstName(userDomain.getFirstName());
		user.setLastName(userDomain.getLastName());
		user.setAadhaarNumber(userDomain.getAadhaarNumber());
		user.setAddress(userDomain.getAddress());
		user.setDob(userDomain.getDob());
		user.setMasterCity(masterCity);
		user.setPassword(userDomain.getPassword());
		user.setMobileNumber(userDomain.getMobileNumber());
		user.setVoterId(userDomain.getVoterId());
		user.setGender(userDomain.getGender());

		logger.info("about to call the USER SERVICE" + user.getFirstName());
		User user1 = userService.registerUser(user);
		user1.getMasterCity().setUserList(null);
		ResponseEntity<User> response = new ResponseEntity<>(user, HttpStatus.OK);
		return response;

	}

	@GetMapping("/loginStatus")
	public User getStatus(@RequestBody User user) {
		logger.info("got the request from the client to validate his login credentials" + user.getVoterId());
		try {
			User user1 = userService.getStatus(user.getVoterId(), user.getPassword());
			user1.setMasterCity(null);
			return user1;
		} catch (Exception e) {
			throw new NotFoundException("USER NOT FOUND");
		}

	}

}
