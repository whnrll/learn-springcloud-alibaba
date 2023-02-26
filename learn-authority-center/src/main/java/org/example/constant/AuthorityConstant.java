package org.example.constant;

/**
 * 描述：授权需要使用的一些常量信息
 *
 * @author xutao
 * @Date 2023-02-26 21:32:42
 */
public interface AuthorityConstant {
    /**
     * RSA 私钥, 除了授权中心以外, 不暴露给任何客户端
     */
    String PRIVATE_KEY = "";

    /**
     * 默认的 Token 超时时间, 一天
     */
    int DEFAULT_EXPIRE_DAY = 1;
}
