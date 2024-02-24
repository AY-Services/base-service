package com.webservice.baseservice.web;

import com.webservice.baseservice.domain.dto.role.RoleDetails;
import com.webservice.baseservice.domain.dto.role.RoleModel;
import com.webservice.baseservice.service.RoleService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RequiredArgsConstructor
public class RoleApi {

    private final RoleService roleService;


    protected RoleDetails createRole(RoleModel roleModel) {
        return roleService.createRole(roleModel);
    }

    protected List<RoleDetails> getAllRoles() {
        return  roleService.getAllRoles();
    }

    protected RoleDetails findRoleById(String id) {
        return roleService.getRoleById(id);
    }

    protected RoleDetails updateRole(RoleModel roleModel, String id) {
        return roleService.updateRole(roleModel, id);
    }
}
