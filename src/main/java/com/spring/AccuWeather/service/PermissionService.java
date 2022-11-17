package com.spring.AccuWeather.service;

import com.spring.AccuWeather.model.Permission;
import com.spring.AccuWeather.model.User;
import com.spring.AccuWeather.model.api.PermissionRqDto;
import com.spring.AccuWeather.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PermissionService {

    private final UserService userService;

    public User putPermission(PermissionRqDto permissionRqDto) {
        var user = userService.getById(permissionRqDto.getId());

        for (String permission : permissionRqDto.getPermissions()) {
            user.addPermission(Permission.valueOf(permission));
        }

        return user;
    }

}
