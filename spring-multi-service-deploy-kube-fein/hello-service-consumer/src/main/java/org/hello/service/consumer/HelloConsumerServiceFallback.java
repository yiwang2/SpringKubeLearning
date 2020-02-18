package org.hello.service.consumer;

import org.springframework.stereotype.Component;

@Component
public class HelloConsumerServiceFallback implements HelloConsumerService {

	public String getInfo() {
		return "Hello Service Error. Fallback!";
	}

}
