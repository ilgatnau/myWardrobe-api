package com.gatnau.mywardobe.api.users;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/users")
public class UserController {

    private static List<User> users = new ArrayList<User>();

    @RequestMapping(method= RequestMethod.GET)
    public List<User> users() {
        return users;
    }
    
    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public User user(@RequestParam String id) {
        return new User();
    }
}
