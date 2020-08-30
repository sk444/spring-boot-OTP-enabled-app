package com.pixeltrice.springbootOTPenabledapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserPojo, Integer>{

	UserPojo findByUsername(String username);

} 

