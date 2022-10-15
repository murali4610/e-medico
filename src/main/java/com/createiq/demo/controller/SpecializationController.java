package com.createiq.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.createiq.demo.entity.Qualification;
import com.createiq.demo.entity.Specialization;
import com.createiq.demo.service.QualificationService;
import com.createiq.demo.service.SpecializationService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("api/specialization")
public class SpecializationController {
	
	@Autowired
	private SpecializationService specializationService;
	public String apiName() {

		return "specialization API";
		  }
	@GetMapping("findAll")
	public ResponseEntity<List<Specialization>>findAll(){
		return ResponseEntity.status(HttpStatus.OK).body(specializationService.findAll());
		
	}

	@GetMapping("findById/{did}")
	public ResponseEntity<Specialization> findById(@PathVariable  Integer did){
		return ResponseEntity.status(HttpStatus.OK).body(specializationService.findById(did));
		
	}
	@PostMapping("save")
	public ResponseEntity<Specialization> save(@RequestBody Specialization specialization){
		return ResponseEntity.status(HttpStatus.CREATED).body(specializationService.save(specialization));
		
	}
	@PutMapping("update")
	public ResponseEntity<Specialization>update(Specialization specialization){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(specializationService.save(specialization));
		
	}
	@DeleteMapping("deleteById/{did}")
	public ResponseEntity<?>deleteById(@PathVariable Integer did ){
		specializationService.deleteById(did);
		Map<String, String> responseMap=new HashMap<String, String>(){{
			put("response","Delete Sucessfully");
		}};
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(responseMap);
		
	}

}
