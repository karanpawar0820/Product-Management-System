package com.cts.web.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.web.DTO.UserDto;
import com.cts.web.Response.*;
import com.cts.web.Model.Product;
import com.cts.web.Model.User;
import com.cts.web.Repository.UserRepository;

@Service
public class LoginService {

	@Autowired
	UserRepository userRepository;

	public ApiResponse authenticate(UserDto userdto) {

		if (userdto != null) {
			Optional<User> user = Optional
					.of(userRepository.findByEmailAndPassword(userdto.getEmail(), userdto.getPassword()));
			if (user.isPresent())
				return new ApiResponse("Login Succes", true);
			else
				return new ApiResponse("Login fail", false);
		} else
			return new ApiResponse("Login fail", false);

	}
}
