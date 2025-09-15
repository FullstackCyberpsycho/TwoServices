package com.example.service1;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    private final Service2Client service2Client;

    @Autowired
    public Service(Service2Client service2Client) {
        this.service2Client = service2Client;
    }

    public String callService() {
        return service2Client.getHello();
    }
}
