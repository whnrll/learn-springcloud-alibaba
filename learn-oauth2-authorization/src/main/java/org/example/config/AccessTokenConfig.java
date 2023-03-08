package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

/**
 * 描述：访问令牌配置
 *
 * @author xutao
 * @Date 2023-03-08 20:29:51
 */
@Configuration
public class AccessTokenConfig {
    /**
     * 描述：令牌存储
     * 存储方式：基于内存存储、基于数据库存储、基于 redis 存储
     *
     * @return {@link TokenStore }
     */
    @Bean
    public TokenStore tokenStore() {
        return new InMemoryTokenStore();
    }
}
