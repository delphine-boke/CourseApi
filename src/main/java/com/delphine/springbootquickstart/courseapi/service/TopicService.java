package com.delphine.springbootquickstart.courseapi.service;

import com.delphine.springbootquickstart.courseapi.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Service
public class TopicService {

    //create a mutable list
    //private List<Topic> topics = Arrays.asList(
    //Arrays.asList creates a new non-mutable list
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
                    new Topic("spring", "Spring Framework", "Spring Framework Description"),
                    new Topic("java", "Core Java", "Java Core Description"),
                    new Topic("javascript", "Javascript", "Javascript Description")
                    ));

    public List<Topic> getAllTopics (){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

}
