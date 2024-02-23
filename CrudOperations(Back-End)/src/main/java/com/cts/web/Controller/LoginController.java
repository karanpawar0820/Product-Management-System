package com.cts.web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.web.DTO.UserDto;
import com.cts.web.Repository.UserRepository;
import com.cts.web.Response.ApiResponse;
import com.cts.web.Service.LoginService;

@RestController
@CrossOrigin("*")
public class LoginController {

	@Autowired
	UserRepository userRepository;

	@Autowired
	LoginService loginService;

	@PostMapping("/login")
	public ResponseEntity<?> getAuth(@RequestBody UserDto userdto) {
		
		ApiResponse response = loginService.authenticate(userdto);
		return ResponseEntity.ok().body(response);
	}
}
