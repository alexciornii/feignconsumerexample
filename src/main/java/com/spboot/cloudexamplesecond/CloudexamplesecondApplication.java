package com.spboot.cloudexamplesecond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients(basePackages = {"com.spboot.feignexample.client"})
@SpringBootApplication
public class CloudexamplesecondApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudexamplesecondApplication.class, args);
    }

}
