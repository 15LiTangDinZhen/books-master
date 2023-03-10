package com.ding.books.service;

import com.ding.books.model.dto.QueryPageBeanUsername;
import com.ding.books.model.entity.LendRecord;
import com.ding.books.utils.PageResult;
import com.ding.books.utils.QueryPageBean;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface LendService {
    PageResult pageQuery(QueryPageBean queryPageBean);

    void deleteLend(Integer lendid);

    LendRecord findLendById(Integer lendid);

    void back(Integer lendid);

    List<LendRecord> findAll();

    PageResult pageQueryUser(QueryPageBeanUsername queryPageBean);

    int addLendRecord(Integer bookid,Integer userid);

    List<LendRecord> findLendByBookid(Integer bookid);
}
