package com.ding.books.service;

import com.ding.books.model.entity.ClassInfo;
import com.ding.books.utils.PageResult;
import com.ding.books.utils.QueryPageBean;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ClassService {
    PageResult pageQuery(QueryPageBean queryPageBean);

    List<ClassInfo> findAll();
}
