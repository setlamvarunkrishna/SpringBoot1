package io.springboot.mainapp.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/*when spring perform component scan it will look into this class since it is anotated as a
 * @Service it will create the object for this class at time of the app loading
 * and when other class or controller need it, spring will inject it based on the declaring in
 * dependencies 
 */

@Service
public class TopicService {
	
	

	// public List<Topic> topics= new ArrayList<Topic>();
	// topics.add(); --- genereally we add like this but since no main method
	// here we cannot add like this so we add like below

	public List<Topic> topics = new ArrayList<>(
			Arrays.asList(new Topic("spring", "spring framework", "from javabrains"),
					new Topic("Core Java", "Book to core java", "from Baledung publications")));


	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		/*
		 * here we are performing java 8 feature List.stream() ---- for parallel
		 * running of all objects in list filter()--- condition n which we need
		 * to filter t.getId().equals(id)--- here we are getting id from list
		 * and comparing with the input string argument passed
		 * findFirst()----now we find first object which matches condition
		 * .get()--- to get that object
		 */
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));

	}

	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)){
				topics.set(i, topic);
			return;
			}
		}
	}
	

	public List<Topic> updateTopicFor(Topic updateTopic) {
		 topics.stream().forEach(p -> {
			// if match .. updated to list topic
			 if(p.getId().equals(updateTopic.getId())) {
				 p.setName(updateTopic.getName());
				 p.setDescription(updateTopic.getDescription());
			 }
		});
		 return topics;
	}
	

	// int t;
	//
public List<Topic> uptopic(String id, Topic topic){
	
	topics.forEach(t -> {
		if(t.getId().equals(id)){
			t.setName(topic.getName());
			t.setDescription(topic.getDescription());
		}
	});
	
	return topics;
}
	

}
