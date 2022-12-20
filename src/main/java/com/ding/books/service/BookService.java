package com.ding.books.service;

import com.ding.books.model.dto.AddBook;
import com.ding.books.model.dto.EditBook;
import com.ding.books.model.entity.Book;
import com.ding.books.utils.PageResult;
import com.ding.books.utils.QueryPageBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


//@Transactional(readOnly = true)
@Transactional
@Service
public interface BookService {

    PageResult pageQuery(QueryPageBean queryPageBean);

    void deleteById(Integer id);



 int addBook(AddBook addBook);

 Book findBookById(Integer bookid);

 void lendBook(Integer bookid);

 void edit(EditBook editBook);

 List<Book> findAll();

 List<Book> findAllLimit();

}
