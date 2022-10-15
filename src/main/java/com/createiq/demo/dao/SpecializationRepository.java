package com.createiq.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.createiq.demo.entity.Specialization;

public interface SpecializationRepository extends JpaRepository<Specialization, Integer> {

}
