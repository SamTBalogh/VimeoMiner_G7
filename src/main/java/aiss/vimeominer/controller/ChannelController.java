package aiss.vimeominer.controller;


import aiss.vimeominer.exception.CaptionsNotFoundException;
import aiss.vimeominer.exception.ChannelNotFoundException;
import aiss.vimeominer.exception.CommentsNotFoundException;
import aiss.vimeominer.exception.VideosNotFoundException;
import aiss.vimeominer.model.VideoMiner.Channel;
import aiss.vimeominer.model.VideoMiner.Video;
import aiss.vimeominer.service.CaptionService;
import aiss.vimeominer.service.ChannelService;
import aiss.vimeominer.service.CommentService;
import aiss.vimeominer.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/vimeominer")
public class ChannelController {

    @Value("${videoMiner.url}")
    private String videoMinerUrl;

    @Autowired
    ChannelService channelService;

    @Autowired
    VideoService videoService;

    @Autowired
    CaptionService captionService;

    @Autowired
    CommentService commentService;

    // POST http://localhost:8081/vimeominer/{id}
    @PostMapping("/{id}")
    public Channel PostChannelVideo(@PathVariable("id") String id,
        @RequestParam(name = "maxVideos", defaultValue = "10") Integer maxVideos,
        @RequestParam(name = "maxComments", defaultValue = "10") Integer maxComments) throws ChannelNotFoundException, CaptionsNotFoundException, CommentsNotFoundException, VideosNotFoundException {

        RestTemplate restTemplate = new RestTemplate();

        Channel channel = channelService.findChannelById(id);

        List<Video> videos = videoService.findVideosByChannelIdMaxVideos(id, maxVideos);

        for(Video video : videos){
            video.setCaptions(captionService.findCaptionsByVideoId(video.getId()));
            video.setComments(commentService.findCommentsByVideoIdMaxComments(video.getId(), maxComments));
        }

        channel.setVideos(videos);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Channel> requestEntity = new HttpEntity<>(channel, headers);
        restTemplate.exchange(videoMinerUrl+"/channels", HttpMethod.POST, requestEntity, Void.class);

        return channel;

    }

    @GetMapping("/{id}")
    public Channel GetChannelVideo(@PathVariable("id") String id,
                                    @RequestParam(name = "maxVideos", defaultValue = "10") Integer maxVideos,
                                    @RequestParam(name = "maxComments", defaultValue = "10") Integer maxComments) throws ChannelNotFoundException, CaptionsNotFoundException, CommentsNotFoundException, VideosNotFoundException {

        Channel channel = channelService.findChannelById(id);

        List<Video> videos = videoService.findVideosByChannelIdMaxVideos(id, maxVideos);

        for(Video video : videos){
            video.setCaptions(captionService.findCaptionsByVideoId(video.getId()));
            video.setComments(commentService.findCommentsByVideoIdMaxComments(video.getId(), maxComments));
        }

        channel.setVideos(videos);

        return channel;

    }
}
