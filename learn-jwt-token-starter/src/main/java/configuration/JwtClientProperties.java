package configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "jwt.client")
public class JwtClientProperties {
    private boolean enable;
    private String issure;
    private String secret;
}
