package springboot.poc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.controller.entity.Topics;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topics> getAllTopics() {
		return Arrays.asList(
				new Topics("Spring1","Spring FrameWork1","Spring Framework Desc1!"),
				new Topics("Spring2","Spring FrameWork2","Spring Framework Desc2!"),
				new Topics("Spring3","Spring FrameWork3","Spring Framework Desc3!")
				);
	}
}
