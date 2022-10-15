package com.createiq.demo.service;

import java.util.List;


import com.createiq.demo.entity.Specialization;

public interface  SpecializationService {
	List<Specialization>findAll();
	Specialization findById(Integer sid);
	Specialization  save (Specialization Specialization);
	Specialization update(Specialization Specialization);
	void deleteById(Integer sid);

}
