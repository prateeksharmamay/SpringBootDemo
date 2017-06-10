package com.springboot.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Prateek on 6/10/2017.
 */

@Service

public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("1","A","Chem"),
            new Topic("2","B","Bio"),
            new Topic("3","C","Physics")));

    public List<Topic> getTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id){
        for(int i = 0 ; i < topics.size() ; i++){
            if(topics.get(i).getId().equals(id)){
                topics.set(i,topic);
            }
        }
    }

    public void deleteTopic(String id){
        for(int i = 0 ; i < topics.size() ; i++){
            if(topics.get(i).getId().equals(id)){
                topics.remove(i);
            }
        }
    }
}
