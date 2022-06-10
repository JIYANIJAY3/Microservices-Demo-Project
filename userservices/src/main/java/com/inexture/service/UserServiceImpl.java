package com.inexture.service;

import com.inexture.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServices{

    List<User> userList = List.of(
            new User(1,"Jay","1234567899"),
            new User(2,"JayDeep","9874563215"),
            new User(3,"Ketan","123455793"),
            new User(4,"Veer","5484156484456")

    );

    @Override
    public User getUser(long userId) {
        return this.userList.stream().filter(user -> user.getUserId()==userId).findAny().orElse(null);
    }
}
