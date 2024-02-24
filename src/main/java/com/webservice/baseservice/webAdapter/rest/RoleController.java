package com.webservice.baseservice.webAdapter.rest;


import com.webservice.baseservice.domain.dto.role.RoleDetails;
import com.webservice.baseservice.domain.dto.role.RoleModel;
import com.webservice.baseservice.service.RoleService;
import com.webservice.baseservice.web.RoleApi;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/role")
public class RoleController extends RoleApi {


    public RoleController(RoleService roleService) {
        super(roleService);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public RoleDetails createRole(@RequestBody RoleModel roleModel){
        return super.createRole(roleModel);
    }

    @GetMapping("/getAll")
    @ResponseStatus(HttpStatus.OK)
    public List<RoleDetails> getAllRoles(){
        return super.getAllRoles();
    }

    @GetMapping("/find/{id}")
    @ResponseStatus(HttpStatus.OK)
    public RoleDetails findRoleById(@PathVariable String id){
        return super.findRoleById(id);
    }

    @PutMapping("/update/{id}")
    public RoleDetails updateRole(@RequestBody RoleModel roleModel, @PathVariable String id){
        return  super.updateRole(roleModel, id);
    }
}
