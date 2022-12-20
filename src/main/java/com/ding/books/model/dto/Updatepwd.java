package com.ding.books.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Updatepwd {

    private String username;
    private  String oldpwd;
    private String newpwd;
}
