package com.project.election.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.election.entity.ElectionType;

public interface ElectionTypeRepository extends JpaRepository<ElectionType, Integer> {

}
