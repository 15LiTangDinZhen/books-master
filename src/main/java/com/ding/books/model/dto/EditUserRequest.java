package com.ding.books.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EditUserRequest {

    private Integer id;
    private String username;
    private String password;
    private String sex;
    private String phone;
    private String city;

}
