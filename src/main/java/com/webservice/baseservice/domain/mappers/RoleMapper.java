package com.webservice.baseservice.domain.mappers;


import com.webservice.baseservice.domain.dto.RoleDetails;
import com.webservice.baseservice.domain.dto.RoleModel;
import com.webservice.baseservice.domain.entities.Role;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    Role fromModelToDb(RoleModel roleModel);

    RoleDetails fromDbToDetails(Role result);
    List<RoleDetails> fromDbToDetails(List<Role> result);
}
