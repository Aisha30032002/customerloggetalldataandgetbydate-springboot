package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
 

interface UserRepo extends JpaRepository<User,Integer> {
	List<User> findAll();
	@Query(value="SELECT*FROM User u where u.date=?1",nativeQuery=true)
	List<User> findbyDate(String date);
}