package com.carloseduardo.workshopmongo.resources;

import com.carloseduardo.workshopmongo.domain.Post;
import com.carloseduardo.workshopmongo.domain.User;
import com.carloseduardo.workshopmongo.dto.UserDTO;
import com.carloseduardo.workshopmongo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post post = service.findById(id);

        return ResponseEntity.ok().body(post);
    }
}
