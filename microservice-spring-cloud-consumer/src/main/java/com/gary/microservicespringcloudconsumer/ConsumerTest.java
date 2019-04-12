package com.gary.microservicespringcloudconsumer;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerTest {

    @Autowired
    private FeignClientTest test;

    @GetMapping("testClient/{id}")
    public String test(@PathVariable String id){
        return "hello and " + test.test(id);
    }
}
