package com.createiq.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.createiq.demo.entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

}
