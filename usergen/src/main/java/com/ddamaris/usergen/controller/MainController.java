package com.ddamaris.usergen.controller;

import com.ddamaris.usergen.UsergenApplication;
import com.ddamaris.usergen.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/getuser")
public class MainController {

    @GetMapping("/{userId}")
    public User getById(@PathVariable("userId") int userId){
        return UsergenApplication.getUsers().stream().filter(x -> x.getId() == userId).findFirst().orElse(null);
    }
}
