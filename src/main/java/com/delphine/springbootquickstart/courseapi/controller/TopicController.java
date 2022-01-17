package com.delphine.springbootquickstart.courseapi.controller;


import com.delphine.springbootquickstart.courseapi.model.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("spring", "Spring Framework", "Spring Framework Description"),
                new Topic("java", "Core Java", "Java Core Description"),
                new Topic("javascript", "Javascript", "Javascript Description")
                );
    }

}
