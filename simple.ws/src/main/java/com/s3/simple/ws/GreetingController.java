package com.s3.simple.ws;


import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Welcome, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/api")
    public GreetingPojo greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new GreetingPojo(counter.incrementAndGet(), String.format(template, name));
    }
}