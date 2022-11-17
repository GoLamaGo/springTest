package com.spring.AccuWeather.controller;

import com.spring.AccuWeather.model.User;
import com.spring.AccuWeather.model.api.PermissionRqDto;
import com.spring.AccuWeather.service.PermissionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/permission")
@AllArgsConstructor
public class PermissionController {

    private final PermissionService permissionService;

    @PutMapping(path = "")
    public User putPermission(@RequestBody PermissionRqDto permissionRqDto) {
        System.out.println(permissionRqDto);
        return permissionService.putPermission(permissionRqDto);
    }
}
