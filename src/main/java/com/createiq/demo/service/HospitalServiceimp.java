package com.createiq.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.demo.dao.HospitalRepository;
import com.createiq.demo.entity.Hospital;

@Service
public class HospitalServiceimp implements HospitalService {
@Autowired
private HospitalRepository hospitalRepository;
	@Override
	public List<Hospital> findAll() {
		return hospitalRepository.findAll();
	}

	@Override
	public Hospital findById(Integer hid) {
		return hospitalRepository.getById(hid);
	}

	@Override
	public Hospital save(Hospital hospital) {
		return hospitalRepository.save(hospital);
	}

	@Override
	public Hospital update(Hospital hospital) {
		return hospitalRepository.save(hospital);
	}

	@Override
	public void deleteById(Integer hid) {
		hospitalRepository.deleteById(hid);
	}

}
