package com.createiq.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.demo.dao.DoctorRepository;
import com.createiq.demo.entity.Doctor;

@Service
public class DoctorServiceImpl implements  DoctorService{
	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public List<Doctor> findAll() {
		return doctorRepository.findAll();
	}

	@Override
	public Doctor findById(Integer did) {
		
		return doctorRepository.getById(did);
	}

	@Override
	public Doctor save(Doctor doctor) {
		return doctorRepository.save(doctor);
	}

	@Override
	public Doctor update(Doctor doctor) {
		return doctorRepository.save(doctor);
	}

	@Override
	public void deleteById(Integer did) {
		doctorRepository.deleteById(did);
	}

}
