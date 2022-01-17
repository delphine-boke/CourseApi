package com.delphine.springbootquickstart.courseapi.controller;


import com.delphine.springbootquickstart.courseapi.model.Topic;
import com.delphine.springbootquickstart.courseapi.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired    //means needs dependency injection
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    //get topic by id
    @RequestMapping("/topics/{id}")
    public  Topic getTopic(@PathVariable String id){ //id is available in the path
        return topicService.getTopic(id);
    }

}
