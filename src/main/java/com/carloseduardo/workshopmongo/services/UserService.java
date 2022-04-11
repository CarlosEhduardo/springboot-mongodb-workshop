package com.carloseduardo.workshopmongo.services;

import com.carloseduardo.workshopmongo.domain.User;
import com.carloseduardo.workshopmongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public List<User> findAll() {
        List<User> list = repository.findAll();
        return list;
    }
}
