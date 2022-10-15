package com.createiq.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.createiq.demo.entity.Qualification;

public interface QualificationRepostory extends JpaRepository<Qualification, Integer>{

}
