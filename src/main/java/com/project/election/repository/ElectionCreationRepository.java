package com.project.election.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.election.entity.ElectionCreation;

public interface ElectionCreationRepository extends JpaRepository<ElectionCreation, Integer>{

}
