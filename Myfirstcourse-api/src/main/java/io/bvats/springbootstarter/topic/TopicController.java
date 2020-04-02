package io.bvats.springbootstarter.topic;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController

public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("bch", "bbb", "hu"),
				new Topic("b1h", "bbb", "hu"),
				new Topic("b2h", "bbb", "hu"));
		
	}
}
