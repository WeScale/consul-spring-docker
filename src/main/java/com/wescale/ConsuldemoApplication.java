package com.wescale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@RestController
public class ConsuldemoApplication {

    private static final Logger logger = LoggerFactory.getLogger(ConsuldemoApplication.class);
    
    @Value("${spring.cloud.consul.discovery.instanceId}")
    private String instanceId;
    
    @RequestMapping("/")
    public String home() {
        logger.info(instanceId);
        return "Hello Docker World";
    }
	public static void main(String[] args) {
		SpringApplication.run(ConsuldemoApplication.class, args);
	}
}
