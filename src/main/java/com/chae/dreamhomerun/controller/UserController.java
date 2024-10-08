package com.chae.dreamhomerun.controller;

import com.chae.dreamhomerun.domain.User;
import com.chae.dreamhomerun.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = UserController.REQUEST_BASE_PATH, produces = MediaTypes.HAL_JSON_VALUE)
public class UserController {

    static final String REQUEST_BASE_PATH = "/api/member";

    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllMembers() {
        return ResponseEntity.ok(
                userService.getAllMembers());
    }

    @GetMapping("2")
    public List<User> getAllMembers2() {
        return userService.getAllMembers();
    }
}
