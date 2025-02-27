package com.hp.ecomproject.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.hp.ecomproject.entity.User;
import com.hp.ecomproject.projection.UserProjection;

@RepositoryRestResource(excerptProjection = UserProjection.class)
@CrossOrigin(origins = "*")
public interface UserRepository extends JpaRepository<User, UUID> {
	
	

}
