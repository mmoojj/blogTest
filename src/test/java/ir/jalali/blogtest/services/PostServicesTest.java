package ir.jalali.blogtest.services;

import ir.jalali.blogtest.model.Posts;
import ir.jalali.blogtest.repository.PostRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PostServicesTest {

    @Mock
    private PostRepository postRepository;
    @InjectMocks
    private PostService postService;

    @Test
    public void services_save_posts_Test() {
        Posts posts = Mockito.mock(Posts.class);

        when(postRepository.save(Mockito.any(Posts.class))).thenReturn(posts);

        Posts postSaved = postService.savePosts(posts);

        Assertions.assertThat(postSaved).isNotNull();

    }

    @Test
    public void services_get_all_posts_Test() {
        Posts posts = Mockito.mock(Posts.class);
        when(postRepository.findAll()).thenReturn(List.of(posts));

        List<Posts> list = postService.getPosts();
        Assertions.assertThat(list).isNotNull();
    }
}
