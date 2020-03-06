package com.company.yash.spring5app.repositories;

import com.company.yash.spring5app.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
