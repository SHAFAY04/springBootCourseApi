
package com.spring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicsService {

    List<topic> topiclist = new ArrayList<>(Arrays.asList(

         new topic(98, "Spring", "Spring framework"),
         new topic(04, "SpringBoot", "SpringBoot Framework"),
         new topic(04, "OOP", "Java Basic Object Orientation")
        ));

    public List<topic> getTopics(){

        return topiclist;
    }
   
    public topic getTopics(int id){

        return topiclist.stream().filter(t-> t.getId()==id).findFirst().get();
    }

    public void newTopic(topic newTopic){

        topiclist.add(newTopic);
    }

    public void updateTopic(topic newTopic,int id) {
        
       for (int i = 0; i < topiclist.size(); i++) {
        
            if (topiclist.get(i).getId()==id) {
                topiclist.set(i, newTopic);
            }
            return;
       }
    
    }

    public void deleteTopic(int id) {
        
        topiclist.removeIf(t-> t.getId()==id);
    }
}
