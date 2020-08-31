package com.lilas.demo.service;

import com.lilas.demo.domian.User;
import com.lilas.demo.repo.UserRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid User");
        }
        return user;
    }

    public Iterable<User> findAll() {
        return userRepo.findAll();
    }

    public void save(User user) {
        userRepo.save(user);
    }
}
