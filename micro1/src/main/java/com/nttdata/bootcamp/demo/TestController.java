package com.nttdata.bootcamp.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
public class TestController {
	
	@GetMapping(path="/micro1")
	public String helloWorld() {
		return "Hello world 1";
	}

}
