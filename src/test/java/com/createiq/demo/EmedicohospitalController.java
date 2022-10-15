package com.createiq.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.createiq.demo.controller.DoctorContorller;
import com.createiq.demo.controller.HospitalController;
import com.createiq.demo.entity.Hospital;
import com.createiq.demo.service.HospitalService;
import com.createiq.demo.service.HospitalServiceimp;

import ch.qos.logback.core.boolex.Matcher;

@WebMvcTest(HospitalController.class)
@RunWith(SpringRunner.class)
public class EmedicohospitalController {
	@MockBean
 private HospitalServiceimp hospitalService;
	@Autowired
	MockMvc mockMvc;
	
	public List<Hospital> getHospitals(){
		List<Hospital>list=new ArrayList<Hospital>();
		Hospital hospital=new Hospital();
		hospital.setId(1);
		hospital.setHospitalName("vcare");
		Hospital hospital2=new Hospital();
		hospital2.setId(2);
		hospital2.setHospitalName("pavani");
		list.add(hospital);
		list.add(hospital2);
		return list;
	}
	
	@BeforeEach
	public void before() {
		Mockito.when(hospitalService.findAll()).thenReturn(getHospitals());
	}
	
	@Test
	public void testfindAll() throws Exception{
		
		
		mockMvc.perform(get("/api/hospital/findAll"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$", Matchers.hasSize(2)))
		.andExpect(jsonPath("$[0].hospitalName", Matchers.is("vcare")))
        .andExpect(jsonPath("$[1].hospitalName", Matchers.is("pavani")));
  }
	    		
	    		
	    
	    		
	    		
		
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 ;
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	}
	
	


