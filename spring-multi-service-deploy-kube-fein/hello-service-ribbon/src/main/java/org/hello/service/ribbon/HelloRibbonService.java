package org.hello.service.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.*;

@Service
public class HelloRibbonService {
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "getFallbackHello", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000") })
	public String getInfo() {
		return this.restTemplate.getForObject("http://hello-service:8080/hello", String.class);
	}
	
	private String getFallbackHello() {
		return "Ribbon Hello Service Error. Fallback!";
	}
}
