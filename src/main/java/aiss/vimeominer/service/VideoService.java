package aiss.vimeominer.service;

import aiss.vimeominer.model.VideoMiner.Video;
import aiss.vimeominer.model.VimeoMiner.video.VimeoVideoSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VideoService {

    @Autowired
    RestTemplate restTemplate;

    public List<Video> findVideosByChannelId(String id) {

        String uri = "https://api.vimeo.com/channels/"+id+"/videos?" +
                "access_token=69a30ff8fde5cfacd790e85cc6560aaa";
        VimeoVideoSearch videoSearch = restTemplate.getForObject(uri, VimeoVideoSearch.class);
        List<Video> videos = videoSearch.getVideos().stream().map(Video::new).collect(Collectors.toList());
        return videos;
    }
    public List<Video> findVideosByChannelIdMaxVideos(String id, Integer numVideos) {

        String uri = "https://api.vimeo.com/channels/"+id+"/videos?per_page="
                +numVideos+"&access_token=69a30ff8fde5cfacd790e85cc6560aaa";
        VimeoVideoSearch videoSearch = restTemplate.getForObject(uri, VimeoVideoSearch.class);
        List<Video> videos = videoSearch.getVideos().stream().map(Video::new).collect(Collectors.toList());
        return videos;
    }
}
