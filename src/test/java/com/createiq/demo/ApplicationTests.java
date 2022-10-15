package com.createiq.demo;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.createiq.demo.controller.DoctorContorller;
import com.createiq.demo.controller.HospitalController;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ApplicationTests{
	
	
	@Autowired
	private HospitalController hospitalController;
	
	@Test
	 public void contexLoads() {
		System.out.println(hospitalController);
		Assertions.assertThat(hospitalController).isNotNull();
		
	}
	
	
	
	
}





