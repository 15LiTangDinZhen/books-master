package com.ding.books.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description TODO
 * @Author 丁帅帅
 * @Date 21/12/11 18:48
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddUserRequest {

    private String username;
    private String password;
    private String sex;
    private String phone;
    private String city;

}
