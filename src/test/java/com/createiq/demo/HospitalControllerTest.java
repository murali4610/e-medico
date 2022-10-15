package com.createiq.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.createiq.demo.controller.HospitalController;
import com.createiq.demo.entity.Hospital;
import com.createiq.demo.service.HospitalService;

@RunWith(SpringJUnit4ClassRunner.class)
public class HospitalControllerTest {

	@Mock
	private HospitalService hospitalService;
	
	@InjectMocks
	private HospitalController hospitalController;
	
	@Test
	public void testFindAll() {
		Hospital hospital=new Hospital();
		hospital.setCity("Bhsuj");
		List<Hospital> hospitals=new ArrayList<>();
		hospitals.add(hospital);
		Mockito.when(hospitalService.findAll()).thenReturn(hospitals);
		
		
		ResponseEntity<List<Hospital>> hospitals2=hospitalController.findAll();
		
		System.out.println(hospitals2.getStatusCode().toString());
		assertEquals("200 OK", hospitals2.getStatusCode().toString());
		assertNotEquals(" date", hospitals2.getBody().isEmpty());
		assertEquals(1, hospitals2.getBody().size());
		hospitals2.getBody().forEach(n->System.out.println(n));
	}
	@Test
	public void testFindById() {
		Hospital hospital=new Hospital();
		hospital.setCity("Bhsuj");
		List<Hospital> hospitals=new ArrayList<>();
		hospitals.add(hospital);
		Mockito.when(hospitalService.findById(1)).thenReturn(hospital);
		ResponseEntity<Hospital> hospitals2=hospitalController.findById(1);
		System.out.println(hospitals2.getStatusCode().toString());
		assertEquals("200 OK", hospitals2.getStatusCode().toString());
		
	}
	@Test
	public void testSave() {
		Hospital hospital=new Hospital();
		hospital.setCity("Bhsuj");
		List<Hospital> hospitals=new ArrayList<>();
		hospitals.add(hospital);
		Mockito.when(hospitalService.save(hospital)).thenReturn(hospital);
		ResponseEntity<Hospital> hospitals2=hospitalController.save(hospital);
		System.out.println(hospitals2.getStatusCode().toString());
		assertEquals("201 CREATED", hospitals2.getStatusCode().toString());
		
		
	}
	@Test
	public void testUpdate() {
		Hospital hospital=new Hospital();
		hospital.setCity("Bhsuj");
		List<Hospital> hospitals=new ArrayList<>();
		hospitals.add(hospital);
		Mockito.when(hospitalService.save(hospital)).thenReturn(hospital);
		ResponseEntity<Hospital> hospitals2=hospitalController.save(hospital);
		System.out.println(hospitals2.getStatusCode().toString());
		assertEquals("201 CREATED", hospitals2.getStatusCode().toString());
		
		
	}
	@Test
	public void testDeleteById() {
		Hospital hospital=new Hospital();
		hospital.setId(1);
		hospital.setCity("Bhsuj");
		List<Hospital> hospitals=new ArrayList<>();
		hospitals.add(hospital);
		//Mockito.when(hospitalService.deleteById(1).
		//ResponseEntity<Hospital> hospitals2=hospitalController.deleteById(1)
	//	System.out.println(hospitals2.getStatusCode().toString());
	//	assertEquals("201 CREATED", hospitals2.getStatusCode().toString());
		
	
	}
}
