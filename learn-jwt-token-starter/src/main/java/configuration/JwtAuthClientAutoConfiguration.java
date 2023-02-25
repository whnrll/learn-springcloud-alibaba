package configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Jwt token 客户端认证自动配置类
 */
@Configuration
@EnableConfigurationProperties(JwtClientProperties.class)
public class JwtAuthClientAutoConfiguration {

}
