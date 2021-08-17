package com.rafaelzabotto.workshopmongo.resources;

import com.rafaelzabotto.workshopmongo.domain.Post;
import com.rafaelzabotto.workshopmongo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value="/posts")
public class PostResource {

    @Autowired
    private PostService postService;

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = postService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
