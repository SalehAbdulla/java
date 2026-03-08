package com.embarkx.FirstSpring;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {


    @GetMapping("/hello/{name}")
    public HelloResponse helloParams(@PathVariable String name){
        return new HelloResponse("Hello, " + name);
    }

    @GetMapping("/hello")
    public HelloResponse hello(){
        return new HelloResponse("Hello World!");
    }

    @PostMapping("/hello")
    public HelloResponse hello(@RequestBody String name){
        return new HelloResponse("Hello from @PostMapping handler\n" + "Welcome " + name + "!");
    }

}
