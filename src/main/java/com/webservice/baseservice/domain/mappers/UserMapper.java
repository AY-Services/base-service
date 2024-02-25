package com.webservice.baseservice.domain.mappers;


import com.webservice.baseservice.domain.dto.user.UserDetails;
import com.webservice.baseservice.domain.dto.user.UserModel;
import com.webservice.baseservice.domain.entities.User;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDetails fromDbToDetails(User userDB);

    User fromModelToDb(UserModel userModel);
}