package org.example;

import org.example.util.UUIDUtil;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UUIDUtilTest {
    @Test
    public void t1() {
        System.out.println(UUIDUtil.generateUUID());
    }
}
