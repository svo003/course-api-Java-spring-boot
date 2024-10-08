package segunofe.courseapidata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import segunofe.courseapidata.dto.Topic;
import segunofe.courseapidata.repository.TopicRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;


    public List<Topic> getTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topic -> topics.add(topic));
        return topics;
    }


    public Topic getTopic(String id) {
        return topicRepository.findById(id).orElse(null);
    }


    public void addTopic(Topic topic) {

        topicRepository.save(topic);
    }


    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }

}
