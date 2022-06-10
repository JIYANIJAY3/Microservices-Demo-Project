package com.inexture.contact.controller;

import com.inexture.contact.model.Contact;
import com.inexture.contact.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contect/user")
public class ContectController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/{userId}")
    public List<Contact> getContact(@PathVariable("userId") long userId)
    {
        return contactService.getContectOfUser(userId);
    }
}
