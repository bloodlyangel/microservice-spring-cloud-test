package com.gary.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test")
@RestController
public class ServiceTest {

    @GetMapping("/test1/{id}")
    public String test1(@PathVariable String id){
        return "hello" + id;
    }
}
