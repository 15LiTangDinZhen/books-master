package com.ding.books.controller;

import com.ding.books.model.dto.LoginRequest;
import com.ding.books.model.entity.Admin;
import com.ding.books.service.AdminService;
import com.ding.books.utils.MessageConstant;
import com.ding.books.utils.Result;
import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author LYHzzz
 * @create 2022-12-20-13:12
 */

@RequestMapping("/admin")
@RestController
public class AdminController {
    private static final Logger logger = Logger.getLogger(AdminController.class);
    @Autowired
    private AdminService adminService;


    @RequestMapping("/login")
    public Result login(@RequestBody LoginRequest loginRequest, HttpSession session){

        String token = adminService.findByName(loginRequest.getUsername(), loginRequest.getPassword());
        session.setAttribute("token",token);

        if (token == null) {
            logger.info("登录"+MessageConstant.Login_Admin_FAIL);
            return new Result(false, MessageConstant.Login_Admin_FAIL,token);

        } else {
            logger.info("登录"+MessageConstant.Login_Admin_SUCCESS);
            return  new Result(true, MessageConstant.Login_Admin_SUCCESS,token);
        }

    }
}
