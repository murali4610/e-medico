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

import com.createiq.demo.entity.Doctor;
import com.createiq.demo.entity.Qualification;
import com.createiq.demo.service.DoctorService;
import com.createiq.demo.service.QualificationService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("api/qualification")
public class QualificationController {
	@Autowired
	private QualificationService  qualificationService;
	public String apiName() {

		return "qualification API";
		  }
	@GetMapping("findAll")
	public ResponseEntity<List<Qualification>>findAll(){
		return ResponseEntity.status(HttpStatus.OK).body(qualificationService.findAll());
		
	}

	@GetMapping("findById/{did}")
	public ResponseEntity<Qualification> findById(@PathVariable Integer did){
		return ResponseEntity.status(HttpStatus.OK).body(qualificationService.findById(did));
		
	}
	@PostMapping("save")
	public ResponseEntity<Qualification> save(@RequestBody  Qualification doctor){
		return ResponseEntity.status(HttpStatus.CREATED).body(qualificationService.save(doctor));
		
	}
	@PutMapping("update")
	public ResponseEntity<Qualification>update(Qualification doctor){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(qualificationService.save(doctor));
		
	}
	@DeleteMapping("deleteById/{did}")
	public ResponseEntity<?>deleteById(@PathVariable Integer did ){
		qualificationService.deleteById(did);
		Map<String, String> responseMap=new HashMap<String, String>(){{
			put("response","Delete Sucessfully");
		}};
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(responseMap);
		
	}

}
