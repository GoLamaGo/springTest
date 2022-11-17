package com.spring.AccuWeather.service;

import com.spring.AccuWeather.model.User;
import com.spring.AccuWeather.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User getById(int id) {
        return userRepository.getById(id);
    }

    public User addUser(User user) {
        return userRepository.addUser(user);
    }

}
