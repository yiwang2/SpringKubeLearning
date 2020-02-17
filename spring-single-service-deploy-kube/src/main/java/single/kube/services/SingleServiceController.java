package single.kube.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingleServiceController {

	@RequestMapping("/hello")
	public String sayHellp() {
		return "hello, this is single kube service";
	}

}
