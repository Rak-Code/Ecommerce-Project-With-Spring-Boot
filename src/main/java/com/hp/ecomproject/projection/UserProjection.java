package com.hp.ecomproject.projection;

import java.util.List;

import org.springframework.data.rest.core.config.Projection;

import com.hp.ecomproject.entity.Address;
import com.hp.ecomproject.entity.User;

@Projection(name = "userProjection",types = User.class)
public interface UserProjection {

	String getName();
	List<Address> getAddresses();
	
}
