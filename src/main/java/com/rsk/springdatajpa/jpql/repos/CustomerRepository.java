package com.rsk.springdatajpa.jpql.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rsk.springdatajpa.jpql.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	@Modifying
	@Query("update Customer set email=:emailz where id=:idz")
	public void updateStudentz(@Param("idz") Integer id, @Param("emailz") String email);   
}
