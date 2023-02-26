package org.example.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.Gender;

import java.util.Date;

/**
 * 描述：学生
 *
 * @author xutao
 * @Date 2023-02-26 23:14:49
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String no;

    private String name;

    private Date birth;

    private Gender gender;
}
