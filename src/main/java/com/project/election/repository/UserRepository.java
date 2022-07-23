package com.project.election.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.election.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	@Query(value="select * from user u where u.voter_id= :voterId and u.password= :password",nativeQuery=true)
	public User getStatus(String voterId,String password);

}
