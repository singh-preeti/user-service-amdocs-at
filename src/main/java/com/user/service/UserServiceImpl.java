package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //fake user list

    List<User> list = List.of(
            new User(101L, "Pankaj", "8976888941"),
            new User(102L, "Manish", "9999978899"),
            new User(104L, "Seema", "88885567789")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
