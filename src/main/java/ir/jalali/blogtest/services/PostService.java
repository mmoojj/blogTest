package ir.jalali.blogtest.services;

import ir.jalali.blogtest.model.Posts;
import ir.jalali.blogtest.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository){
        this.postRepository=postRepository;
    }


    @Transactional
    public Posts savePosts(Posts posts){
        return  postRepository.save(posts);
    }

    public List<Posts> getPosts(){
        return postRepository.findAll();
    }
}
