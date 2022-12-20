package com.ding.books.service;

import com.ding.books.model.entity.Admin;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author LYHzzz
 * @create 2022-12-20-13:05
 */

@Transactional
@Service
public interface AdminService {
    String findByName(String username,String password);
}
