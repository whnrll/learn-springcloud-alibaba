package org.example.vo;

import java.util.Date;

import org.example.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 描述：学生
 *
 * @author xutao
 * @Date 2023-02-26 23:14:49
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student2 {
    private String no;

    private String name;

    private Date birth;

    private Gender gender;

    private Integer age;
}
