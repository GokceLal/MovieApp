package org.example.mapper;

import org.example.dto.request.RegisterRequestDto;
import org.example.dto.response.LoginResponceDto;
import org.example.dto.response.RegisterResponceDto;
import org.example.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    LoginResponceDto fromUserToLoginResponceDto(final User user);

    User fromRegisterRequestDtoToUser(final RegisterRequestDto dto);

    RegisterResponceDto fromUserToRegisterResponceDto(final User user);

}