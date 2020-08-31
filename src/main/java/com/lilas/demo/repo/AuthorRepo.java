package com.lilas.demo.repo;


import com.lilas.demo.domian.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;


public interface AuthorRepo extends CrudRepository<Author, Long> {

    Page<Author> findAll(Pageable pageable);

    Author findAllByFirstName(String firstName);

    Set<Author> findByIdIn(List<Long> ids);

}
