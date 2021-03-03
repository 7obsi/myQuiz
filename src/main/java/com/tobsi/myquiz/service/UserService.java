package com.tobsi.myquiz.service;

import com.tobsi.myquiz.entity.User;
import com.tobsi.myquiz.payload.request.LoginRequest;
import com.tobsi.myquiz.payload.request.SignupRequest;
import com.tobsi.myquiz.payload.response.JwtResponse;

import java.util.List;

public interface UserService {

    JwtResponse authenticateUser(LoginRequest loginRequest);

    User registerUser(SignupRequest signUpRequest) throws Exception;

    List<User> findAll();

    User findById(Long id);

    void deleteEmployee(Long id);
}

