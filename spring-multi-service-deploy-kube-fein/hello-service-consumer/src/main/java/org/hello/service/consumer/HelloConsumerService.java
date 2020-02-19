package org.hello.service.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "http://hello-service:8080", 
             url = "http://hello-service:8080", fallback = HelloConsumerServiceFallback.class)
public interface HelloConsumerService {

	@GetMapping("/hello")
	public String getInfo();
}
