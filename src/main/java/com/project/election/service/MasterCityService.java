package com.project.election.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.election.entity.MasterCity;
import com.project.election.repository.MasterCityRepository;

@Service
public class MasterCityService {

	private static final Logger logger = LogManager.getLogger(MasterCity.class);

	@Autowired
	private MasterCityRepository mastercityRepository;

	@Transactional
	public MasterCity getCityById(int id) {
		logger.info("got the request from the controller class to get the city by passing " + id);
		Optional<MasterCity> masterCity = mastercityRepository.findById(id);
		return masterCity.get();

	}

}
