package com.createiq.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.demo.dao.SpecializationRepository;
import com.createiq.demo.entity.Specialization;

@Service
public class SpecializationServiceImpl implements SpecializationService {
@Autowired
private SpecializationRepository SpecializationRepository;
	@Override
	public List<Specialization> findAll() {
		return SpecializationRepository.findAll();
	}

	@Override
	public Specialization findById(Integer sid) {
		return SpecializationRepository.getById(sid);
	}

	@Override
	public Specialization save(Specialization Specialization) {
		return SpecializationRepository.save(Specialization);
	}

	@Override
	public Specialization update(Specialization Specialization) {
		return SpecializationRepository.save(Specialization);
	}

	@Override
	public void deleteById(Integer sid) {
		SpecializationRepository.deleteById(sid);
	}

}
