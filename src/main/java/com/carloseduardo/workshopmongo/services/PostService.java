package com.carloseduardo.workshopmongo.services;

import com.carloseduardo.workshopmongo.domain.Post;
import com.carloseduardo.workshopmongo.domain.User;
import com.carloseduardo.workshopmongo.repositories.PostRepository;
import com.carloseduardo.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> user = repository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}
