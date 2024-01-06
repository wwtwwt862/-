package com.sunmk.dormitory.entity;

import lombok.Data;

/**
 * com.sunmk.dormitory.entity
 *
 * @author: wwt
 * @Description TODO
 * @Date 2024/1/5 14:42
 */

@Data
public class User {
    private Integer id;
    private String Username;
    private String Password;
    private String email;
    private String phone;
    private String address;

}
