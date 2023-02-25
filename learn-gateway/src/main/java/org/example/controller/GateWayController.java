package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/gateway")
public class GateWayController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/serviceInstances")
    public List<ServiceInstance> serviceInstances(@RequestParam(defaultValue = "learn-gateway") String serviceId) {
        return discoveryClient.getInstances(serviceId);
    }
}
