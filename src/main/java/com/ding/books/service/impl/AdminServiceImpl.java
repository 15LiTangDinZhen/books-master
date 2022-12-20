package com.ding.books.service.impl;

import com.ding.books.mapper.AdminMapper;
import com.ding.books.model.entity.Admin;
import com.ding.books.service.AdminService;
import com.ding.books.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author LYHzzz
 * @create 2022-12-20-13:06
 */
@Transactional
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;


    @Override
    public String findByName(String username, String password) {
        Admin admin = adminMapper.findByName(username, password);
        if(admin == null){
            return null;

        }else {
            String token = JWTUtils.geneJsonWebToken(admin);
            return token;
        }

    }
}
