package com.spring.AccuWeather.controller;

import com.spring.AccuWeather.service.UserService;
import com.spring.AccuWeather.model.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(path = "/{id}")
    public User getRandomUser(@PathVariable int id) {
        return userService.getById(id);
    }

    @PostMapping(path = "")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
