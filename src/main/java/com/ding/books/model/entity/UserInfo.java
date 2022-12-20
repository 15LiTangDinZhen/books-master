package com.ding.books.model.entity;

import lombok.Data;


@Data
public class UserInfo {
    private int id;
    private String username;
    private String password;
    private String role;
}

