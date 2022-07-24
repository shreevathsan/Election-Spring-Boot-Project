package com.project.election.service;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.election.domain.CandidateDomain;
import com.project.election.entity.Candidate;
import com.project.election.repository.CandidateRepository;

@Service
public class CandidateService {

	private static final Logger logger = LogManager.getLogger(CandidateService.class);

	@Autowired
	private CandidateRepository candidateRepository;

	@Transactional
	public Candidate createCandidate(Candidate candidate) {
		logger.info("about to create candidate of name" + candidate.getName());
		Candidate response = null;
		try {
			response = candidateRepository.save(candidate);

		} catch (Exception e) {
			logger.error(e);
			logger.catching(e);
		}
		return response;
	}

}
