package com.tobsi.myquiz.endpoint;

import com.tobsi.myquiz.endpoint.dto.UserDto;
import com.tobsi.myquiz.endpoint.mapper.UserMapper;
import com.tobsi.myquiz.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService service;
    private final UserMapper mapper;

    Logger logger = LoggerFactory.getLogger(UserController.class);

    public UserController(UserService service, UserMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/users")
    List<UserDto> all() {
        logger.info("/api/users");
        return mapper.entityListToDto(service.findAll());
    }
}
