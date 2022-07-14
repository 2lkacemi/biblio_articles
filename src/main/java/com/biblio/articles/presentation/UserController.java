package com.biblio.articles.presentation;

import com.biblio.articles.business.IUserService;
import com.biblio.articles.persistence.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final IUserService iUserService;

    @Autowired
    public UserController(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return iUserService.addUser(newUser);
    }

    // Single item
    @GetMapping("/user/{email}")
    User one(@PathVariable String email) {
        return iUserService.getUserByEmail(email);
    }
}
