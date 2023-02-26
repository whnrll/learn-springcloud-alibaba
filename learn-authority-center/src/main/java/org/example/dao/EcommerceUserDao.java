package org.example.dao;

import org.example.entity.EcommerceUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 描述：EcommerceUser Dao 接口定义
 *
 * @author xutao
 * @Date 2023-02-26 21:36:54
 */
public interface EcommerceUserDao extends JpaRepository<EcommerceUser, Long> {
    /**
     * 描述：根据用户名查询 EcommerceUser 对象 select * from t_ecommerce_user where username = ?
     *
     * @param username 用户名
     * @return {@link EcommerceUser }
     */
    EcommerceUser findByUsername(String username);

    /**
     * 描述：根据用户名和密码查询实体对象 select * from t_ecommerce_user where username = ? and password = ?
     *
     * @param username 用户名
     * @return {@link EcommerceUser }
     */
    EcommerceUser findByUsernameAndPassword(String username, String password);
}
