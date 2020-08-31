package com.lilas.demo.service;


import com.lilas.demo.domian.Author;
import com.lilas.demo.repo.AuthorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class AuthorService {
    private final AuthorRepo authorRepo;

    public void save(Author author) {
        authorRepo.save(author);
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepo.findAll();
    }

    public Page<Author> findAll(Pageable pageable) {
        return authorRepo.findAll(pageable);
    }

    public Author findAllByFirstName(String firstName) {
        return authorRepo.findAllByFirstName(firstName);
    }

    public Set<Author> findByIdIn(List<Long> ids) {
        return authorRepo.findByIdIn(ids);
    }

    public void saveAll(List<Author> authors){
        authorRepo.saveAll(authors);
    }
}
