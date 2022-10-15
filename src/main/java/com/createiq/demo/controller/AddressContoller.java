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
import com.createiq.demo.entity.Specialization;
import com.createiq.demo.service.AddressService;
import com.createiq.demo.service.SpecializationService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("api/address")

public class AddressContoller {	
	@Autowired
	private AddressService addressService;
	public String apiName() {

		return "address API";
		  }
	
	@GetMapping("findAll")
	public ResponseEntity<List<Address>>findAll(){
		return ResponseEntity.status(HttpStatus.OK).body(addressService.findAll());
		
	}

	@GetMapping("findById/{did}")
	public ResponseEntity<Address> findById(@PathVariable Integer did){
		return ResponseEntity.status(HttpStatus.OK).body(addressService.findById(did));
		
	}
	@PostMapping("save")
	public ResponseEntity<Address> save(@RequestBody Address address){
		return ResponseEntity.status(HttpStatus.CREATED).body(addressService.save(address));
		
	}
	@PutMapping("update")
	public ResponseEntity<Address>update(Address address){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(addressService.save(address));
		
	}
	@DeleteMapping("deleteById/{did}")
	public ResponseEntity<?>deleteById(@PathVariable Integer did ){
		addressService.deleteById(did);
		Map<String, String> responseMap=new HashMap<String, String>(){{
			put("response","Delete Sucessfully");
		}};
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(responseMap);
		
	}

}
