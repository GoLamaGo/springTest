package com.spring.AccuWeather.repository;

import com.spring.AccuWeather.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class UserRepository {

    private List<User> users = new ArrayList<>();

    public User getById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User addUser(User user) {
        System.out.println(user);
        users.add(user);
        return user;
    }

}
