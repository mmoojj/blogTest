package ir.jalali.blogtest.repository;


import ir.jalali.blogtest.model.Posts;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class PostRepositoryTest {
    @Autowired
    PostRepository postRepository;



    @Test
    public void postRepository_saveTest(){
        Posts posts = Posts.builder().title("test").body("test").build();

        Posts  result=  postRepository.save(posts);

        Assertions.assertThat(result).isNotNull();
        Assertions.assertThat(result.getId()).isGreaterThan(0);
    }
    
}
