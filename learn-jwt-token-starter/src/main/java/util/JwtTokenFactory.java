package util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.security.Key;
import java.util.Date;
import java.util.Objects;

public class JwtTokenFactory {
    private static final long EXPIRATION_TIME = 60000;

    private static volatile JwtTokenFactory instance;

    public static JwtTokenFactory getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (JwtTokenFactory.class) {
                if (Objects.isNull(instance)) {
                    instance = new JwtTokenFactory();
                }
            }
        }

        return instance;
    }

    private String createToken() {
        Date expireAt = new Date(System.currentTimeMillis() + EXPIRATION_TIME);
        String token = Jwts.builder()
                .setExpiration(expireAt)
                .setIssuer("")
                .setClaims(null)
                .signWith(, SignatureAlgorithm.HS256).toString();
        return token;
    }

    private static class SignKey implements Key {
        @Override
        public String getAlgorithm() {
            return null;
        }

        @Override
        public String getFormat() {
            return null;
        }

        @Override
        public byte[] getEncoded() {
            return new byte[0];
        }
    }
}
