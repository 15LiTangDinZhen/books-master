package com.ding.books.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ding.books.model.dto.ClassBook;
import com.ding.books.model.entity.ClassInfo;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface ClassMapper extends BaseMapper<ClassInfo> {
    Page<ClassBook> selectByCondition(String queryString);
}
