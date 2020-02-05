package org.hello.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServiceController {

	
	@RequestMapping(method = RequestMethod.GET)
	public String getHelloService() {
		return "This is a single service";
	}
}
