package com.ding.books.controller;

import com.ding.books.model.entity.ClassInfo;

import com.ding.books.service.ClassService;
import com.ding.books.utils.ExcelUtils;
import com.ding.books.utils.PageResult;
import com.ding.books.utils.QueryPageBean;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author 丁帅帅
 * @Date 21/12/23 09:20
 * @Version 1.0
 */

@RestController
@RequestMapping("/class")
public class ClassController {


    @Autowired
    private ClassService classService;



    /**
     * 分页查询
     * @param queryPageBean
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult findPage(@RequestBody QueryPageBean queryPageBean){
        PageResult pageResult =classService.pageQuery(queryPageBean);

        return pageResult;
    }




}
