package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.util.CryptoUtil;
import org.junit.Test;

@Slf4j
public class CryptoUtilTest {
    @Test
    public void generateKeyBytes() throws Exception {
        String key = CryptoUtil.generateRsaPublicAndPrivateKey(2048);
        System.out.println(key);
    }
}
