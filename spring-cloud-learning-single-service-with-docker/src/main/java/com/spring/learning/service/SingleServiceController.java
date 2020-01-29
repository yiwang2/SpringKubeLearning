package com.spring.learning.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingleServiceController {

	@RequestMapping(method = RequestMethod.GET)
	public String getSingleService() {
		return "This is a single service";
	}
}
