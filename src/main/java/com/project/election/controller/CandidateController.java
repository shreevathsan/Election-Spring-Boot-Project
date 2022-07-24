package com.project.election.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.election.domain.CandidateDomain;
import com.project.election.entity.Candidate;
import com.project.election.entity.MasterCity;
import com.project.election.service.CandidateService;
import com.project.election.service.MasterCityService;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

	private static final Logger logger = LogManager.getLogger(CandidateController.class);

	@Autowired
	private CandidateService candidateService;

	@Autowired
	private MasterCityService masterCityService;

	@PostMapping("/createCandidate")
	public ResponseEntity<Candidate> createCandidate(@RequestBody CandidateDomain candidateDomain) {
		logger.info("got the request from the ECO to create candidate for name" + candidateDomain.getName());
		ResponseEntity<Candidate> entityResponse = null;
		try {
			logger.info("about to call the masterService class to call get the city by" + candidateDomain.getCity());
			MasterCity city = masterCityService.getCityById(candidateDomain.getCity());
			city.setCandidateList(null);
			city.setUserList(null);
			Candidate candidate = new Candidate();
			candidate.setAddress(candidateDomain.getAddress());
			candidate.setAge(candidateDomain.getAge());
			candidate.setDob(candidateDomain.getDob());
			candidate.setElectionType(candidate.getElectionType());
			candidate.setMobileNumber(candidateDomain.getMobileNumber());
			candidate.setName(candidateDomain.getName());
			candidate.setPartyName(candidate.getPartyName());
			candidate.setCity(city);
			Candidate response = candidateService.createCandidate(candidate);
			entityResponse = new ResponseEntity(response, HttpStatus.OK);

		} catch (Exception e) {
			logger.error(e);
			logger.catching(e);
		}
		return entityResponse;

	}

}
