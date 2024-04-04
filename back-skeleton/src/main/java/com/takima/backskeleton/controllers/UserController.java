package com.takima.backskeleton.controllers;

import com.takima.backskeleton.DTO.UserDto;
import com.takima.backskeleton.models.User;
import com.takima.backskeleton.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("users")
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("")
    public List<User> listUsers() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteById(id);
    }

    @PostMapping("")
    public void addUser(@RequestBody UserDto userDto) {
        userService.addUser(userDto);
    }

    @PostMapping("/{id}")
    public void updateUser(@RequestBody UserDto userDto, @PathVariable Long id) {
        userService.updateUser(userDto, id);
    }
}
