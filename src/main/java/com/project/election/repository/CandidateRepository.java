package com.project.election.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.election.entity.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate,Integer>{

}
