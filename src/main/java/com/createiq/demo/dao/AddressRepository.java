package com.createiq.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.createiq.demo.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
