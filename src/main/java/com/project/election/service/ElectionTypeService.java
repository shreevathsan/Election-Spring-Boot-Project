package com.project.election.service;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.election.entity.ElectionType;
import com.project.election.repository.ElectionTypeRepository;

@Service
public class ElectionTypeService {

	private static final Logger logger = LogManager.getLogger(ElectionTypeService.class);

	@Autowired
	private ElectionTypeRepository electionTypeRepository;

	public ElectionType getElectionType(int id) {
		logger.info("about to get the electiontype by passing eletionId");
		Optional<ElectionType> elections = electionTypeRepository.findById(id);
		ElectionType electionType = elections.get();
		return electionType;

	}

}
