package com.createiq.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.demo.dao.QualificationRepostory;
import com.createiq.demo.entity.Qualification;

@Service
public class QualificationServiceImpl implements QualificationService {
@Autowired
private QualificationRepostory qualificationRepostory;
	@Override
	public List<Qualification> findAll() {
		return qualificationRepostory.findAll();
	}

	@Override
	public Qualification findById(Integer qid) {
		return qualificationRepostory.getById(qid);
	}

	@Override
	public Qualification save(Qualification qualification) {
		return qualificationRepostory.save(qualification);
	}

	@Override
	public Qualification update(Qualification qualification) {
		return qualificationRepostory.save(qualification);
	}

	@Override
	public void deleteById(Integer qid) {
		qualificationRepostory.deleteById(qid);
	}

}
