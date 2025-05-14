package com.example.jwt.mapper;

import com.example.jwt.dto.UserDto;
import com.example.jwt.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userToEntity(UserDto userDto);

    UserDto userToDto(User user);
}
