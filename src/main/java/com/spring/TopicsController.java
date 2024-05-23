package com.spring;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class TopicsController {

    @Autowired
    TopicsService topicsService;

    @RequestMapping(method = RequestMethod.GET, value = "/topics")
    public List<topic> getTopics(){

        return topicsService.getTopics();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/topics/{id}")
    public topic getTopics(@PathVariable int id){

        return topicsService.getTopics(id);
    }

    @RequestMapping(method = RequestMethod.POST,value="/topics")
    public void newTopic(@RequestBody topic newTopic){

        topicsService.newTopic(newTopic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody topic newTopic , @PathVariable int id){

        topicsService.updateTopic(newTopic,id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "topics/{id}")
    public void deleteTopic(@PathVariable int id){

        topicsService.deleteTopic(id);
    }
}
