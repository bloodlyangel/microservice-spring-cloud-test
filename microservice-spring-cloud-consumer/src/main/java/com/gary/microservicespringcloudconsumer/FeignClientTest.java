package com.gary.microservicespringcloudconsumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name="springcloud-provider-config111")
public interface FeignClientTest {

    @RequestMapping(value = "/test/test1/{id}",method = RequestMethod.GET)
//    @GetMapping(value = "/test/test1/{id}")
    String test(@PathVariable("id") String id);

}
