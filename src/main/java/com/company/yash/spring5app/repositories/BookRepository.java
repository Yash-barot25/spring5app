package com.company.yash.spring5app.repositories;

import com.company.yash.spring5app.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository  extends CrudRepository<Book, Long> {
}
