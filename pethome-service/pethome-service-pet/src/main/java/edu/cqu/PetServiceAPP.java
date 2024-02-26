package edu.cqu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("edu.cqu.mapper")
public class PetServiceAPP {
    public static void main(String[] args) {
        SpringApplication.run(PetServiceAPP.class,args);
    }
}
