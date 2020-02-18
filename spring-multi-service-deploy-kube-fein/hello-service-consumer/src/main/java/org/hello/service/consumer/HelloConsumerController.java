package org.hello.service.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConsumerController {

	@Autowired
    private HelloConsumerService helloConsumerService;

    @GetMapping("/info")
    public String getInfo(){
        return helloConsumerService.getInfo();
    }
}
