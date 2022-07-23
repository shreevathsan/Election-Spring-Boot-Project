package com.project.election.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.election.entity.MasterCity;

public interface MasterCityRepository extends JpaRepository<MasterCity, Integer> {

}
