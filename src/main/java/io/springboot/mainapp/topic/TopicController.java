package io.springboot.mainapp.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	// @RequestMapping("/topics")
	// public String getAllTopic(){
	// return"all topics";
	// }

	/*
	 * we are using topicservice as a variable it is located in a different
	 * class so in order to use it, we need to tell spring that you can get this
	 * from the topiservice class which is located in package. To say we
	 * use @Autowired--- which will by default inject and connect them
	 */

	@Autowired
	private TopicService topicService;

	/*
	 * @Autowired private TopicService topicService; makes us to access this
	 * return topicService.getAllTopics();--- we are using it
	 * 
	 */

	@RequestMapping("/topics")
	public List<Topic> getAllTopic() {
		return topicService.getAllTopics();
	}

	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);

	}

	// we want to make it as a post method value -- for which url we need to map
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}

//	// we want to update
//	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
//	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
//		topicService.updateTopic(id,topic);
//	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.uptopic(id, topic);
	}

	// we want to delete
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);

	}

}
