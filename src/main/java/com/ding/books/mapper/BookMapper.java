package com.ding.books.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ding.books.model.entity.Book;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface BookMapper extends BaseMapper<Book> {


    Page<Book> selectByCondition( String queryString);


    void deleteById(Integer id);



    List<Book> findAllLimit();

}
