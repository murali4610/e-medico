package com.createiq.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.demo.dao.AddressRepository;
import com.createiq.demo.entity.Address;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
private AddressRepository addressRepository;
	@Override
	public List<Address> findAll() {
		
		return addressRepository.findAll();
	}

	@Override
	public Address findById(Integer aid) {
		
		return addressRepository.getById(aid);
	}

	@Override
	public Address save(Address address) {
		
		return addressRepository.save(address);
	}

	@Override
	public Address update(Address address) {
		
		return addressRepository.save(address);
	}

	@Override
	public void deleteById(Integer aid) {
		addressRepository.deleteById(aid);
		
	}

}
