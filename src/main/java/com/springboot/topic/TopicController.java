package com.springboot.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Prateek on 5/11/2017.
 */

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService ;

    @RequestMapping(value = "/topics",method = RequestMethod.GET)
    public List<Topic> getAllTopics(){

        List<Topic> topics =topicService.getTopics();

        return topics;
    }

    @RequestMapping(value = "/topics/{ID}",method = RequestMethod.GET)
    public Topic getTopic(@PathVariable("ID") String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(value = "/topics",method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(value = "/topics/{id}",method = RequestMethod.PUT)
    public void addTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(topic,id);
    }

    @RequestMapping(value = "/topics/{id}",method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
