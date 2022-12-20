package com.ding.books.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ding.books.model.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author LYHzzz
 * @create 2022-12-20-13:19
 */
@Mapper
@Repository
public interface AdminMapper extends BaseMapper<Admin> {

    Admin findByName(@Param("username") String username,@Param("password") String password);

}
