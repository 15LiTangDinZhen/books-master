package com.ding.books.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ding.books.model.dto.CollectBook;
import com.ding.books.model.entity.CollectRecord;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;



@Mapper
@Repository
public interface CollectMapper extends BaseMapper<CollectRecord> {

    Page<CollectBook> selectByCondition(String queryString);

    Page<CollectBook> selectByConditionUser(@Param("id") Integer id, @Param("bookname") String bookname);


    List<CollectRecord> findCollectBookByBookidandUsrid(@Param("bookid") Integer bookid,@Param("userid") Integer userid);
}
