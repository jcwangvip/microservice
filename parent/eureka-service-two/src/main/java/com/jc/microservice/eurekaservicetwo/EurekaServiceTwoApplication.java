package com.jc.microservice.eurekaservicetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableEurekaServer
public class EurekaServiceTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceTwoApplication.class, args);
    }

}
