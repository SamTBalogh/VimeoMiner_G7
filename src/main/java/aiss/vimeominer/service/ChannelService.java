package aiss.vimeominer.service;

import aiss.vimeominer.model.VimeoMiner.channel.VimeoChannel;
import aiss.vimeominer.model.VideoMiner.Video;
import aiss.vimeominer.model.VideoMiner.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ChannelService {

    @Autowired
    RestTemplate restTemplate;

    public Channel findChannelById(String id) {


        String uri = "https://api.vimeo.com/channels/" + id+"?access_token=69a30ff8fde5cfacd790e85cc6560aaa";
        VimeoChannel vimeoChannel = restTemplate.getForObject(uri, VimeoChannel.class);
        Channel channel = new Channel(vimeoChannel.getId(),vimeoChannel.getName(),
                vimeoChannel.getDescription(), vimeoChannel.getCreatedTime());
        return channel;
    }



}
