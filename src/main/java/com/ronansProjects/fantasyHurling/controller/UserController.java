package com.ronansProjects.fantasyHurling.controller;

import com.ronansProjects.fantasyHurling.model.Team;
import com.ronansProjects.fantasyHurling.model.User;
import com.ronansProjects.fantasyHurling.service.UserService;
import javafx.scene.chart.ValueAxis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/getUser")
    public User getUser(@RequestParam int userId){ return userService.getUser(userId); }

    @PostMapping(value="/createUser")
    public User createUser(@RequestBody User user) { return userService.saveUser(user); }

    @PutMapping(value = "/updateUser")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
    
    @DeleteMapping(value = "/deleteUser")
    public void deleteUser(@RequestBody User user) {
        userService.deleteUser(user);
    }
    

    
    
}
