package com.ddamaris.dto.controller;

import com.ddamaris.dto.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class MainController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User getUser (@PathVariable("userId") int userId){

        return restTemplate.getForObject("http://user-service/getuser/" + userId, User.class);
//        return restTemplate.getForObject("http://localhost:8085/getuser/" + userId, User.class);
    }
}
