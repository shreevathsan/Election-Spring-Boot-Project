package com.project.election.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.election.domain.CandidateDomain;
import com.project.election.entity.Candidate;
import com.project.election.entity.ElectionType;
import com.project.election.entity.MasterCity;
import com.project.election.service.CandidateService;
import com.project.election.service.ElectionTypeService;
import com.project.election.service.MasterCityService;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

	private static final Logger logger = LogManager.getLogger(CandidateController.class);

	@Autowired
	private CandidateService candidateService;

	@Autowired
	private MasterCityService masterCityService;

	@Autowired
	private ElectionTypeService electionTypeService;

	@PostMapping("/createCandidate")
	public ResponseEntity<Candidate> createCandidate(@RequestBody CandidateDomain candidateDomain) {
		logger.info("got the request from the ECO to create candidate for name" + candidateDomain.getName());
		ResponseEntity<Candidate> entityResponse = null;
		try {
			logger.info("about to call the masterService class to call get the city by"
					+ candidateDomain.getElectionType());
			Candidate candidate = new Candidate();
			candidate.setAddress(candidateDomain.getAddress());
			candidate.setAge(candidateDomain.getAge());
			candidate.setDob(candidateDomain.getDob());
			System.out.println(candidate.getElectionType());
			candidate.setMobileNumber(candidateDomain.getMobileNumber());
			candidate.setName(candidateDomain.getName());
			candidate.setPartyName(candidateDomain.getPartyName());

			MasterCity city = masterCityService.getCityById(candidateDomain.getCity());
			candidate.setCity(city);

			logger.info("about to call the electionTypeService to get the election type by passing"
					+ candidateDomain.getElectionType());
			ElectionType electionType = new ElectionType();
			electionType = electionTypeService.getElectionType(candidateDomain.getElectionType());
			candidate.setElectionType(electionType);

			Candidate response = candidateService.createCandidate(candidate);
			entityResponse = new ResponseEntity(response, HttpStatus.OK);

		} catch (Exception e) {
			logger.error(e);
			logger.catching(e);
		}
		return entityResponse;

	}

	@PostMapping("/assignCandidateForElection")
	public String assignCandidateForElection(@RequestParam(name="candidateId") int candidateId,@RequestParam(name="electionId") int electionId) {
		logger.info("got the requet from the mco officer to assign the candidate for the election"+ candidateId);
		
		
		
	}

}
