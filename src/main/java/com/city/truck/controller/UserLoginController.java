package com.city.truck.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@Api(description = "Login controller")
@RestController
public class UserLoginController {

    @ApiOperation(value = "login", notes="The API for login")
    @PostMapping("login")
    private String login(String account, String password, HttpServletResponse response) {
        return null;
    }

    @ApiOperation(value = "logout", notes="The API for logout")
    @GetMapping("logout")
    private String logout() {
        return null;
    }

}