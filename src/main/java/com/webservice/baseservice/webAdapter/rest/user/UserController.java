package com.webservice.baseservice.webAdapter.rest.user;

import com.webservice.baseservice.domain.dto.user.UserDetails;
import com.webservice.baseservice.domain.dto.user.UserModel;
import com.webservice.baseservice.service.UserService;
import com.webservice.baseservice.web.UserAPI;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController extends UserAPI {


    public UserController(UserService userService) {
        super(userService);
    }

    @PostMapping("/save")
    public UserDetails createUser(@RequestBody UserModel userModel){
        UserDetails userDetails = super.createUser(userModel);
        return userDetails;
    }
    @GetMapping("/find/{id}")
    public UserDetails findUser(@PathVariable String id){
        UserDetails userDetails = super.findUser(id);
        return userDetails;
    }
    @PutMapping("/update/{id}")
    public UserDetails updateUser(@PathVariable String id, @RequestBody UserModel userModel ){
        return super.updateUser(id, userModel);
    }

    /*@GetMapping("/findByFilter")
    public List<UserDetails> findAllByFilter(SearchCritaria searchCritaria){
        return super.findAllByFilter(searchCritaria);
    }*/


}

