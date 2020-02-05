package org.hello.service.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloServiceConsumerController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${app.hello-service.host}") String helloServiceHost;
    @Value("${app.hello-service.port}") int    helloServicePort;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String getHelloConsumerService() {
		
		String productServiceUrl = "http://" + helloServiceHost + ":" + helloServicePort + "/helloservice";
		
		return restTemplate.getForObject(productServiceUrl, String.class);
	}
}
