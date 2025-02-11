package com.hp.ecomproject.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.hp.ecomproject.entity.Address;
@CrossOrigin(origins = "*")
public interface AddressRepository extends JpaRepository<Address, UUID> {

}
