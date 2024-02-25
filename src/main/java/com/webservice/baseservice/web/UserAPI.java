package com.webservice.baseservice.web;


import com.webservice.baseservice.domain.dto.user.UserDetails;
import com.webservice.baseservice.domain.dto.user.UserModel;
import com.webservice.baseservice.service.UserService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserAPI {


    private final UserService userService;
    //private final SecurityUtiles securityUtiles;


    public UserDetails createUser(UserModel userModel) {
        //UserInfo user = securityUtiles.getLoggedInUser();
        UserDetails userDetails = userService.createUser(userModel);
        return userDetails;
    }

    protected UserDetails findUser(String id) {
        UserDetails userDetails = userService.findUser(id);
        return userDetails;
    }

    protected UserDetails updateUser(String id, UserModel userModel) {
        UserDetails userDetails = userService.updateUser(id, userModel);
        return userDetails;
    }



}

