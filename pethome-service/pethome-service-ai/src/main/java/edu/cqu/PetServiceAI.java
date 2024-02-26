package edu.cqu;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PetServiceAI {
    public static void main(String[] args) {
        SpringApplication.run(PetServiceAI.class,args);
    }
    @Bean
    public Connection createConnection() throws Exception {
        ConnectionFactory factory=new ConnectionFactory();
        factory.setHost("localhost");
        return factory.newConnection();
    }
}
