package com.simply.poclprsserviceapp.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LprsController {

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
