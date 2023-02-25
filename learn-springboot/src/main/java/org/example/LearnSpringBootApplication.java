package org.example;

import configuration.JwtClientProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringBootApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LearnSpringBootApplication.class, args);
        JwtClientProperties bean = context.getBean(JwtClientProperties.class);
        System.out.println(bean);

    }

}
