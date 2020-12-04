package Controller.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topic")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @PostMapping(value = "/topic")
    public void addTopic(@RequestBody Topic topic) {
        System.out.println(topic.getId());
        topicService.addTopic(topic);

    }

}
