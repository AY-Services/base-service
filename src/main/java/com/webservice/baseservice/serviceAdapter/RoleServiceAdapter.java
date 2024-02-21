package com.webservice.baseservice.serviceAdapter;


import com.webservice.baseservice.domain.mappers.RoleMapper;
import com.webservice.baseservice.domain.repository.RoleRepository;
import com.webservice.baseservice.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceAdapter extends RoleService {


    public RoleServiceAdapter(RoleRepository roleRepository, RoleMapper roleMapper) {
        super(roleRepository, roleMapper);
    }
}
