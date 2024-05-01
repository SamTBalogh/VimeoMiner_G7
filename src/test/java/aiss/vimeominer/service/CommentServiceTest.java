package aiss.vimeominer.service;

import aiss.vimeominer.model.VideoMiner.Comment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CommentServiceTest {

    @Autowired
    CommentService service;

    @Test
    void findCommentsByVideoId() {
        List<Comment> comments = service.findCommentsByVideoId("919411397");
        assertNotNull(comments);
        System.out.println(comments);
    }

    @Test
    void findCommentsByVideoIdMaxComments() {
        List<Comment> comments = service.findCommentsByVideoIdMaxComments("941282766", 10);
        assertNotNull(comments);
        System.out.println("The number of comments in the list is "+comments.size());
        System.out.println(comments);
    }
}