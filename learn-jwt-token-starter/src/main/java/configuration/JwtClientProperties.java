package configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "jwt.authentication.client")
public class JwtClientProperties {
    /**
     * 签发人
     */
    private String issuer;

    /**
     * 密钥
     */
    private String cipher;

    /**
     * 过期时间（单位：分）
     */
    private Integer expireMinute = 10;

    /**
     * 刷新间隔时间（单位：分）
     */
    private Integer refreshIntervalMinute = 10;
}
