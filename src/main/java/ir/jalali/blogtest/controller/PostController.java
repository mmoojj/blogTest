package ir.jalali.blogtest.controller;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import ir.jalali.blogtest.model.Posts;
import ir.jalali.blogtest.repository.PostRepository;
import ir.jalali.blogtest.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/post")
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService){
        this.postService=postService;
    }

    @PostMapping(value = {"/",""})
    public Posts savePost(@RequestBody Posts posts){
        return postService.savePosts(posts);
    }
    

    @GetMapping(value = {"/",""})
    public List<Posts> getPost(){
        return postService.getPosts();
    }

}
