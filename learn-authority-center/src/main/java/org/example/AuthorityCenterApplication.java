package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * 描述：授权中心应用程序
 *
 * @author xutao
 * @Date 2023-02-26 20:55:59
 */
@EnableDiscoveryClient
@EnableJpaAuditing
@SpringBootApplication
public class AuthorityCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthorityCenterApplication.class, args);
    }
}