package com.demo.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by josip.kovacek on 10.7.2016..
 */
@RestController
public class UserController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<String> hello() {
        return Arrays.asList("Hello", "World");
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<String> getAllUsers() {
        return Arrays.asList("123", "Peroperic", "asdfsdf");
    }
}
