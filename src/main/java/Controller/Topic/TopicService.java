package Controller.Topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics= new ArrayList<>();
    public List<Topic> getAllTopics(){
        return topics;

    }
    public void addTopic(Topic topic)
    {
        System.out.println(topic.getId()+topic.getEmpName());
        topics.add(topic);
    }
}
