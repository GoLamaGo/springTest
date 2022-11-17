package com.spring.AccuWeather;

import com.spring.AccuWeather.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccuWeatherApplication implements CommandLineRunner {

    private final UserService userService;

    @Autowired
    public AccuWeatherApplication(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(AccuWeatherApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(userService);
    }
}
