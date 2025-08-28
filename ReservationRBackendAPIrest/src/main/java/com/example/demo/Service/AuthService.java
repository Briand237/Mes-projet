package com.example.demo.Service;

import com.example.demo.dtos.SignupRequest;
import com.example.demo.dtos.UserDto;

public interface AuthService {
	UserDto createUser(SignupRequest signupRequest);
	

}
