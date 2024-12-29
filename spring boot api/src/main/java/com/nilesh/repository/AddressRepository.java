package com.nilesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nilesh.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
