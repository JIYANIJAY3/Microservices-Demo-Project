package com.inexture.controller;

import com.inexture.model.Contact;
import com.inexture.model.User;
import com.inexture.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServices userServices;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") long userId){
        User user =  userServices.getUser(userId);

        List contects = this.restTemplate.getForObject("http://contect-service/contect/user/"+user.getUserId(),List.class);
        user.setContactList(contects);
        return user;
    }
}
