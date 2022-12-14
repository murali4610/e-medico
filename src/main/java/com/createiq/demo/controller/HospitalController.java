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

import com.createiq.demo.entity.Address;
import com.createiq.demo.entity.Hospital;
import com.createiq.demo.service.HospitalService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("api/hospital")
public class HospitalController {
	@Autowired
	private HospitalService hospitalService;
	
	public String apiName() {

		return "hospital API";
		  }
	@GetMapping("findAll")
	public ResponseEntity<List<Hospital>>findAll(){
		return ResponseEntity.status(HttpStatus.OK).body(hospitalService.findAll());
		
	}

	@GetMapping("findById/{hid}")
	public ResponseEntity<Hospital> findById(@PathVariable Integer hid){
		return ResponseEntity.status(HttpStatus.OK).body(hospitalService.findById(hid));
		
	}
	@PostMapping("save")
	public ResponseEntity<Hospital>save(@RequestBody Hospital hospital){
		return ResponseEntity.status(HttpStatus.CREATED).body(hospitalService.save(hospital));
		
	}
	@PutMapping("update")
	public ResponseEntity<Hospital>update(Hospital hospital){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(hospitalService.save(hospital));
		
	}
	@DeleteMapping("deleteById/{hid}")
	public ResponseEntity<?>deleteById(@PathVariable Integer hid ){
		hospitalService.deleteById(hid);
		Map<String, String> responseMap=new HashMap<String, String>(){{
			put("response","Delete Sucessfully");
		}};
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(responseMap);
		
	}
}
