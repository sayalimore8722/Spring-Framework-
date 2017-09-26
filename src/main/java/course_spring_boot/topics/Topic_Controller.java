package course_spring_boot.topics;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Topic_Controller {
	
	@RequestMapping("/topics")
	public String topics()
	{
		return "Topics";
	}

}
