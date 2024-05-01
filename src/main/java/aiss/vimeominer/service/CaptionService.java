package aiss.vimeominer.service;

import aiss.vimeominer.model.VideoMiner.Caption;
import aiss.vimeominer.model.VimeoMiner.caption.VimeoCaptionSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CaptionService {

    @Autowired
    RestTemplate restTemplate;

    public List<Caption> findCaptionsByVideoId(String id) {

        String uri = "https://api.vimeo.com/videos/"+id+
                "/texttracks?access_token=69a30ff8fde5cfacd790e85cc6560aaa";
        VimeoCaptionSearch captionSearch = restTemplate.getForObject(uri, VimeoCaptionSearch.class);
        List<Caption> captions = captionSearch.getCaptions().stream().map(Caption::new).collect(Collectors.toList());
        return captions;
    }

}
