package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service 
public class TopicService {

		private	List<Topic> topics = Arrays.asList(
			new Topic("Spring", "Spring Framework", "Spring Framework description"),
			new Topic("Java", "Core Java ", "Core Java description"),
			new Topic("Javascript", "javascript Framework", "Javascript description")
			);	
	
	public List<Topic> getAllTopics() { 
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}

}
