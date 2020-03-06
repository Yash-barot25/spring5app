package com.company.yash.spring5app.repositories;

import com.company.yash.spring5app.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
