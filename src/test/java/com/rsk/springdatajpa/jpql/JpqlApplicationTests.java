package com.rsk.springdatajpa.jpql;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.rsk.springdatajpa.jpql.repos.CustomerRepository;

@SpringBootTest
class JpqlApplicationTests {
	
	@Autowired
	private CustomerRepository repo;
	
	@Test
	void contextLoads() {
	}
	
	@Test 
	@Transactional
	@Rollback(false) 
	public void testDeleteJPQL() {
		repo.updateStudentz(3, "root123456@hotmail.com");
	} 

}
