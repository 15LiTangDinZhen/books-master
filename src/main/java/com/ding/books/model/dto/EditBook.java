package com.ding.books.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EditBook {
    private Integer bookid;
    private String bookname;
    private String author;
    private String publish;
    private String introduction;
    private Integer classid;
    private Integer number;
}
