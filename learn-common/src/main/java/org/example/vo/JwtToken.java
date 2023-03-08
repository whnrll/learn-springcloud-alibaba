package org.example.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 描述：jwt令牌
 *
 * @author xutao
 * @Date 2023-02-28 21:07:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JwtToken {

    /**
     * JWT
     */
    private String token;
}
