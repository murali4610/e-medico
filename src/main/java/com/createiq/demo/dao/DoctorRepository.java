package com.createiq.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.createiq.demo.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
