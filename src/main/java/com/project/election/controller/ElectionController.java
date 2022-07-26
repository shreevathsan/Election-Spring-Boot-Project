package com.project.election.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.election.domain.ElectionCreationDomain;
import com.project.election.entity.ElectionCreation;
import com.project.election.entity.ElectionType;
import com.project.election.entity.MasterCity;
import com.project.election.service.ElectionTypeService;
import com.project.election.service.MasterCityService;

@RestController
@RequestMapping("/")
public class ElectionController {

	private static final Logger logger = LogManager.getLogger(ElectionController.class);

	@Autowired
	private MasterCityService masterCityService;

	@Autowired
	private ElectionTypeService electionTypeService;

	@PostMapping("/createElection")
	public ElectionCreation createElection(@RequestBody ElectionCreationDomain ecd) {
		logger.info("got the request from the mco officer to create election" + ecd.getDate());
		ElectionCreation electionCreation = new ElectionCreation();
		electionCreation.setEndTime(ecd.getEndTime());
		electionCreation.setStartTime(ecd.getStartTime());
		electionCreation.setDate(ecd.getDate());

		logger.info("about to call the master city to fetch the city by passing cityId" + ecd.getCity());
		MasterCity masterCity = masterCityService.getCityById(ecd.getCity());
		electionCreation.setCity(masterCity);

		logger.info("about to call the ElectionCreation Service to get the ElectionCreation object"
				+ ecd.getElectionType());
		ElectionType electionType = electionTypeService.getElectionType(ecd.getElectionType());
		electionCreation.setElectionType(electionType);
		
		logger.info("about to call the creation service to create the election");
		ElectionCreation ec=electionTypeService.createElection(electionCreation);
		return ec;

	}

}
