package com.webservice.baseservice.service;


import com.webservice.baseservice.domain.dto.user.UserDetails;
import com.webservice.baseservice.domain.dto.user.UserModel;
import com.webservice.baseservice.domain.entities.User;
import com.webservice.baseservice.domain.mappers.UserMapper;
import com.webservice.baseservice.domain.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    public UserDetails createUser(UserModel userModel) {
        User userDb = userMapper.fromModelToDb(userModel);
        User result = userRepository.save(userDb);
        UserDetails userDetails = userMapper.fromDbToDetails(result);
        return userDetails;
    }

    public UserDetails findUser(String id) {
        User userDB = userRepository.findById(id).orElse(null);
        UserDetails userDetails = userMapper.fromDbToDetails(userDB);
        return userDetails;
    }

    public UserDetails updateUser(String id, UserModel userModel) {
        User userDB = userRepository.findById(id).orElse(null);
        BeanUtils.copyProperties(userModel, userDB, "id");
        User newUser = userRepository.saveAndFlush(userDB);
        UserDetails userDetails = userMapper.fromDbToDetails(newUser);
        return userDetails;

    }
}
