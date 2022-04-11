package com.carloseduardo.workshopmongo.services;

import com.carloseduardo.workshopmongo.domain.User;
import com.carloseduardo.workshopmongo.dto.UserDTO;
import com.carloseduardo.workshopmongo.repositories.UserRepository;
import com.carloseduardo.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public List<User> findAll() {
        List<User> list = repository.findAll();
        return list;
    }

    public User findById(String id) {
        Optional<User> user = repository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User user) {
        return repository.insert(user);
    }

    public User fromDTO(UserDTO userDTO) {
        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
    }
}
