package com.tobsi.myquiz.endpoint.mapper;

import com.tobsi.myquiz.endpoint.dto.UserDto;
import com.tobsi.myquiz.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto entityToDto(User entity);
    User dtoToEntity(UserDto dto);
    List<UserDto> entityListToDto(List<User> entity);
    List<User> dtoListToEntity(List<UserDto> dto);
}
