package com.ding.books.controller;

import com.ding.books.model.dto.QueryPageBeanUsername;
import com.ding.books.model.entity.CollectRecord;
import com.ding.books.model.entity.LendRecord;

import com.ding.books.service.CollectService;
import com.ding.books.utils.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/collect")
public class CollectController {

    @Autowired
    private CollectService collectService;



    /**
     * 用户分页查询
     * @param queryPageBean
     * @return
     */
    @RequestMapping("/findPageUser")
    public PageResult findPageUser(@RequestBody QueryPageBeanUsername queryPageBean){
        PageResult pageResult =collectService.pageQueryUser(queryPageBean);

        return pageResult;
    }

    /**
     * 管理员分页查询
     * @param queryPageBean
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult findPage(@RequestBody QueryPageBean queryPageBean){
        PageResult pageResult =collectService.pageQuery(queryPageBean);

        return pageResult;
    }

    /**
     * 删除
     * @param collectid
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(Integer collectid){
        try{
            collectService.deleteCollect(collectid);
        }catch (Exception e){
            e.printStackTrace();
            //服务调用失败
            return new Result(false, MessageConstant.DELETE_Collect_FAIL);
        }
        return  new Result(true, MessageConstant.DELETE_Collect_SUCCESS);
    }







}
