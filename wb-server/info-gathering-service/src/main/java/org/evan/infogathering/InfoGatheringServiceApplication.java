package org.evan.infogathering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class InfoGatheringServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfoGatheringServiceApplication.class, args);
    }

    @GetMapping("/hello")
    public String test() {
        return "hello world";
    }

}
