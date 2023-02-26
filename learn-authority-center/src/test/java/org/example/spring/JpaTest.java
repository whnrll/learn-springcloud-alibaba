package org.example.spring;

import java.util.List;

import org.example.BaseSpringTest;
import org.example.dao.EcommerceUserDao;
import org.example.entity.EcommerceUser;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;

import cn.hutool.crypto.digest.MD5;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JpaTest extends BaseSpringTest {
    @Autowired
    private EcommerceUserDao ecommerceUserDao;

    @Test
    public void createUserRecord() {
        EcommerceUser user = new EcommerceUser();
        user.setUsername("xt3");
        user.setPassword(MD5.create().digestHex("123456"));



        user.setExtraInfo("{}");
        user = ecommerceUserDao.save(user);
        log.info("save user: [{}]", JSON.toJSON(user));
    }

    @Test
    public void queryUserRecords() {
        List<EcommerceUser> all = ecommerceUserDao.findAll();
        System.out.println(JSON.toJSON(all));
    }
}
