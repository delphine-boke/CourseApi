package com.delphine.springbootquickstart.courseapi.service;

import com.delphine.springbootquickstart.courseapi.model.Topic;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
                    new Topic("spring", "Spring Framework", "Spring Framework Description"),
                    new Topic("java", "Core Java", "Java Core Description"),
                    new Topic("javascript", "Javascript", "Javascript Description")
                    );
    public List<Topic> getAllTopics (){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

}
