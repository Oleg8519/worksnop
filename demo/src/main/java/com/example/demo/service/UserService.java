package com.example.demo.service;

import com.example.demo.model.User;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface UserService {

    //методы по д/з
    int whatAge(int year_of_Birthday);
    int calculateAge(LocalDate birthDate);

    //==================================================================

    User saveUser(User user);
    void deleteUser(int id);
    Optional<User> getUserById(int id);
    List<User> findAllUsers();

}
