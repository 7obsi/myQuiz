package com.tobsi.myquiz.endpoint;

import com.tobsi.myquiz.payload.request.LoginRequest;
import com.tobsi.myquiz.payload.request.SignupRequest;
import com.tobsi.myquiz.payload.response.MessageResponse;
import com.tobsi.myquiz.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    UserService userService;

    Logger logger = LoggerFactory.getLogger(AuthController.class);


    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
        logger.info("/api/auth/login " + loginRequest);
        try {
            return ResponseEntity.ok(userService.authenticateUser(loginRequest));
        } catch (Exception e){
            return ResponseEntity.status(401).body("Unauthorized");
        }
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) throws Exception {
        logger.trace("/api/auth/register" + signUpRequest);
        try {
            userService.registerUser(signUpRequest);
            return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
        } catch (Exception e){
            return ResponseEntity.status(409).body("Conflict");
        }
    }
}
