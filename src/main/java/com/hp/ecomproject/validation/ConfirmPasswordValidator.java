package com.hp.ecomproject.validation;
import com.hp.ecomproject.entity.User;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ConfirmPasswordValidator implements ConstraintValidator<ConfirmPassword,User> {

	@Override
	public boolean isValid(User user, ConstraintValidatorContext context) {
		if(user.getPassword().equals(user.getConfirmPassword()))
		return true;
		else
			return false;
	}

}
