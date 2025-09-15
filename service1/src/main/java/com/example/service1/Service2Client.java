package com.example.service1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service2", url = "http://localhost:8081")
public interface Service2Client {
    @GetMapping("/api/hello")
    String getHello();
}
