package com.webservice.baseservice.service;



import com.webservice.baseservice.domain.dto.role.RoleDetails;
import com.webservice.baseservice.domain.dto.role.RoleModel;
import com.webservice.baseservice.domain.entities.Role;
import com.webservice.baseservice.domain.mappers.RoleMapper;
import com.webservice.baseservice.domain.repository.RoleRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    public RoleService(RoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }


    public RoleDetails createRole(RoleModel roleModel) {
        Role roleDb = roleMapper.fromModelToDb(roleModel);
        Role result = roleRepository.save(roleDb);
        RoleDetails roleDetails = roleMapper.fromDbToDetails(result);
        return roleDetails;
    }

    public List<RoleDetails> getAllRoles() {
        List<Role> resultList =  roleRepository.findAll();
        List<RoleDetails> roleList = roleMapper.fromDbToDetails(resultList);
        return roleList;
    }

    public RoleDetails getRoleById(String id) {
        Role roledb = roleRepository.findById(id).orElse(null);
        RoleDetails result = roleMapper.fromDbToDetails(roledb);
        return result;
    }

    public RoleDetails updateRole(RoleModel roleModel, String id) {
        Role roledb = roleRepository.findById(id).orElse(null);
        BeanUtils.copyProperties(roleModel, roledb);
        Role newRole = roleRepository.saveAndFlush(roledb);
        RoleDetails result = roleMapper.fromDbToDetails(newRole);
        return  result;
    }
}
