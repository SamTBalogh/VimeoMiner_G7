package aiss.vimeominer.service;

import aiss.vimeominer.model.VideoMiner.Comment;
import aiss.vimeominer.model.VimeoMiner.comment.VimeoCommentSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentService {

    @Autowired
    RestTemplate restTemplate;

    public List<Comment> findCommentsByVideoId(String id) {

        String uri = "https://api.vimeo.com/videos/"+id+
                "/comments?access_token=69a30ff8fde5cfacd790e85cc6560aaa";
        VimeoCommentSearch commentSearch = restTemplate.getForObject(uri, VimeoCommentSearch.class);
        List<Comment> comments = commentSearch.getComments().stream().map(Comment::new).collect(Collectors.toList());
        return comments;
    }

    public List<Comment> findCommentsByVideoIdMaxComments(String id, Integer numComments) {

        String uri = "https://api.vimeo.com/videos/"+id+
                "/comments?per_page="+numComments+"&access_token=69a30ff8fde5cfacd790e85cc6560aaa";
        VimeoCommentSearch commentSearch = restTemplate.getForObject(uri, VimeoCommentSearch.class);
        List<Comment> comments = commentSearch.getComments().stream().map(Comment::new).collect(Collectors.toList());
        return comments;
    }
}
