package com.hp.ecomproject.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hp.ecomproject.entity.Product;


@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, UUID> {

}
