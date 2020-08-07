package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    //методы по д/з
    @RequestMapping(path = "/user", method = RequestMethod.POST)
    public int findUserAge(@RequestBody LocalDate birthDate) {
        return userService.calculateAge(birthDate);
    }

    @RequestMapping(path = "/user-year", method = RequestMethod.GET)
    public int findAge(@RequestParam int year_of_Birthday) {
        return userService.whatAge(year_of_Birthday);
    }

    //=======================================================================================

    @RequestMapping(path = "/users", method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @RequestMapping(path = "/users/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }

    @RequestMapping(path = "/users/{id}", method = RequestMethod.GET)
    public Optional<User> getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public List getAllUsers() {
        return userService.findAllUsers();
    }

}
