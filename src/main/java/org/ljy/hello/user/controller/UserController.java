package org.ljy.hello.user.controller;

import org.ljy.hello.user.enums.GenderEnum;
import org.ljy.hello.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LJY
 */
@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/hello")
    public String hello() {
        userService.register("ljy", GenderEnum.MALE);
        return "Hello World";
    }

}
