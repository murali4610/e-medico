package com.createiq.demo.service;

import java.util.List;


import com.createiq.demo.entity.Doctor;

public interface DoctorService {
	List<Doctor>findAll();
	Doctor findById(Integer did);
	Doctor  save (Doctor doctor);
	Doctor update(Doctor doctor);
	void deleteById(Integer did);

}
