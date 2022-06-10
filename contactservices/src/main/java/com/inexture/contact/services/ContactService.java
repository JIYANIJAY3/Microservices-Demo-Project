package com.inexture.contact.services;

import com.inexture.contact.model.Contact;

import java.util.List;

public interface ContactService {

    List<Contact> getContectOfUser(long userId);
}
