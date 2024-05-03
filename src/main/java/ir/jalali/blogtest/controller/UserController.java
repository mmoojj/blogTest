package ir.jalali.blogtest.controller;


import ir.jalali.blogtest.model.User;
import ir.jalali.blogtest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }

    @GetMapping(value = {"/",""})
    public List<User> getAllUsers(){
        return userService.findAllUser();
    }

    @PostMapping(value = {"/",""})
    public User registerUser(@RequestBody User user){
        return  userService.registerUser(user);
    }


}
