package edu.cqu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("edu.cqu.mapper")
public class PetServiceArticle {
    public static void main(String[] args) {
        SpringApplication.run(PetServiceArticle.class,args);
    }
}
