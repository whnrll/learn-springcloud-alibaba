package org.example.service;

import org.example.vo.UsernameAndPassword;

/**
 * 描述：JWT 相关服务接口定义
 *
 * @author xutao
 * @Date 2023-02-26 21:34:48
 */
public interface IJwtService {

    /**
     * 描述：生成令牌
     *
     * @param username 用户名
     * @param password 密码
     * @return {@link String }
     * @throws Exception 异常
     */
    String generateToken(String username, String password) throws Exception;

    /**
     * 描述：生成令牌
     *
     * @param username 用户名
     * @param password 密码
     * @param expire 到期
     * @return {@link String }
     * @throws Exception 异常
     */
    String generateToken(String username, String password, int expire) throws Exception;

    /**
     * 描述：注册用户并生成令牌
     *
     * @param usernameAndPassword 用户名和密码
     * @return {@link String }
     * @throws Exception 异常
     */
    String registerUserAndGenerateToken(UsernameAndPassword usernameAndPassword) throws Exception;
}
