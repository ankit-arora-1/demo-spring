package dev.ankit.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstApp {

    @RequestMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @RequestMapping("/hello/{name}")
    public String sayHelloWithName(@PathVariable("name")
                                       String personName) {
        return "hello" + personName;
    }

    // Break for 5 minutes: 10:32 -> 10:38
}
