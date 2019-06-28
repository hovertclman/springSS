package com.kgc.service;


import com.kgc.entity.User;

import java.util.List;

public interface UserService {
        public List<User> findAll();
        public User findById(int id);
        public int insert(User user);
        public int delete(int id);
        public int update(User user);
}
