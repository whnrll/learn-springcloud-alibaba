package org.example.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 描述：用户表实体类定义
 *
 * @author xutao
 * @Date 2023-02-26 21:34:23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_ecommerce_user")
public class EcommerceUser implements Serializable {

    /** 自增主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /** 用户名 */
    @Column(name = "username", nullable = false)
    private String username;

    /** MD5 密码 */
    @Column(name = "password", nullable = false)
    private String password;

    /** 额外的信息, json 字符串存储 */
    @Column(name = "extra_info", nullable = false)
    private String extraInfo;

    /** 创建时间 */
    @CreatedDate
    @Column(name = "create_time", nullable = false)
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 更新时间 */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @LastModifiedDate
    @Column(name = "update_time", nullable = false)
    private Date updateTime;
}
