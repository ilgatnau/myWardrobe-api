package com.gatnau.mywardobe.api.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

    @RequestMapping(method= RequestMethod.GET)
    public Iterable<User> users() {
        return userRepository.findAll();
    }
    
    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public User user(@RequestParam Long id) {
        return userRepository.findOne(id);
    }
    
    @RequestMapping(method= RequestMethod.POST)
    public User addUser(User user) {
        return userRepository.save(user);
    }
    
    @RequestMapping(value="/{id}", method= RequestMethod.PUT)
    public User updateUser(User user) {
        return userRepository.save(user);
    }
    
    @RequestMapping(value="/{id}", method= RequestMethod.DELETE)
    public void removeUser(@RequestParam Long id) {
        userRepository.delete(id);
    }
}
