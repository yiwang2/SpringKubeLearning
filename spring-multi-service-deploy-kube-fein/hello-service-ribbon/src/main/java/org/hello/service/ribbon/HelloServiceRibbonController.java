package org.hello.service.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServiceRibbonController {

	 @Autowired
	 private HelloRibbonService helloRibbonService;
	
	@RequestMapping("/info")
    public String getInfo() {
		return helloRibbonService.getInfo();
	}
}
