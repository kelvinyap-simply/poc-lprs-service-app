package com.simply.poclprsserviceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@ComponentScan(basePackageClasses = LprsController.class)
public class PocLprsServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocLprsServiceAppApplication.class, args);
	}

	//@GetMapping("/hello")
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "Hello World";
	}

	//@PostMapping("/api/eventReceiver")
	@RequestMapping(value = "/api/eventReceiver", method = RequestMethod.POST)
	public String eventListener(@RequestBody String msg) {
		System.out.println("Message: " + msg);
		return msg;
	}

}
