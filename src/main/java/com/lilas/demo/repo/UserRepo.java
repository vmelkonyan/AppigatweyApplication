package com.lilas.demo.repo;

import com.lilas.demo.domian.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
