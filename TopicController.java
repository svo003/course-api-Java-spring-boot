package segunofe.courseapidata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import segunofe.courseapidata.dto.Topic;
import segunofe.courseapidata.service.TopicService;


import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;


    // CRUD Create (POST) Read (GET) Update (PUT) Delete (DELETE)
    // map a particular request using GET method - to get back all the topics (the whole dataset)
    @RequestMapping("/topics") // this line is saying map any request that is a GET (though not explicitly written here since GET is a default method ) to any request that is a GET on /topics
    public List<Topic> getAllTopics() {  //a method
        return topicService.getTopics();
    }

    // to get one (a particular) topic back from the dataset, say java spring or javascript
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    // create a new resource using the POST method
    @RequestMapping(method = RequestMethod.POST, value ="/topics") // this line is saying map this method to any request that is a POST on /topics
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    // To update a resource using the PUT method
    @RequestMapping(method = RequestMethod.PUT, value ="/topics/{id}") // this line is saying map this method to any request that is a POST on /topics
    public void addTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(id, topic);
    }

    // To delete a topic using the DELETE method
    @RequestMapping(method = RequestMethod.DELETE, value ="/topics/{id}") // this line is saying map this method to any request that is a POST on /topics
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }

}


