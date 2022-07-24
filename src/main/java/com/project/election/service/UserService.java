package com.project.election.service;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.election.entity.User;
import com.project.election.exceptionhandler.NotFoundException;
import com.project.election.repository.UserRepository;

@Service
public class UserService {

	private static final Logger logger = LogManager.getLogger(UserService.class);

	@Autowired
	private UserRepository userRepository;

	@Transactional
	public User registerUser(User user) {
		logger.info("about to call the repository to store the user" + user.getFirstName());
		User user1 = userRepository.save(user);
		return user1;

	}

	@Transactional
	public User getStatus(String voterId, String password) {
		logger.info("about to call the repository class to fetch whether the login creds are correct or not");
		User user = null;
		try {
			user = userRepository.getStatus(voterId, password);
			logger.info("::::::::::::" + user);
		} catch (Exception e) {
			throw new NotFoundException("user Not Found");
		}
		return user;

	}
}
