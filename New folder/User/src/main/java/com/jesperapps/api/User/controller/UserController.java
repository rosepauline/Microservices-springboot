package com.jesperapps.api.User.controller;

import com.jesperapps.api.User.message.*;
import com.jesperapps.api.User.model.*;
import com.jesperapps.api.User.service.*;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public void createUser(@RequestBody UserRequestEntity userRequestEntity){
        log.info("Inside createUser method of UserController");
        User user = new User(userRequestEntity);
        userService.CreateUser(user);
    }
}
