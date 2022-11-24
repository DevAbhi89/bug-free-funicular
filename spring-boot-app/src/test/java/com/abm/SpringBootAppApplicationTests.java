package com.abm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.abm.entity.Customer;
import com.abm.repository.CustomerRepository;

@SpringBootTest
class SpringBootAppApplicationTests {

	@Autowired
	private CustomerRepository custRepo;
	
	@Test
	void contextLoads() {
		Customer cust = new Customer();
		
		cust.setName("Majrul Ansari");
		cust.setEmail("majrul@gmail.com");
		cust.setPassword("abcd@1234");
		cust.setMobileNumber("9876543210");
		
		custRepo.save(cust);
	}

}
