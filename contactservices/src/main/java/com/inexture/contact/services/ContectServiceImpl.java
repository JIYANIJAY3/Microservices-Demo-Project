package com.inexture.contact.services;

import com.inexture.contact.model.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContectServiceImpl implements ContactService{

    List<Contact> contactList = List.of(
            new Contact(1L,"jay@gmail.com","jay",1),
            new Contact(2L,"jayDeep@gmail.com","jayDeep",1),
            new Contact(3L,"ketan@gmail.com","ketan",3),
            new Contact(4L,"veer4@gmail.com","veer",4),
            new Contact(4L,"veer4@gmail.com","veer",4),
            new Contact(4L,"veer2@gmail.com","veer",2)
    );

    @Override
    public List<Contact> getContectOfUser(long userId) {
        return contactList.stream().filter(contact -> contact.getUserId()==userId).collect(Collectors.toList());
    }
}
