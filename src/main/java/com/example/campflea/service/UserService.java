package com.example.campflea.service;

import com.example.campflea.entity.Users;
import java.util.List;

public interface UserService {
    Users register(String username, String password, String role);

    List<Users> findAll();

    Users update(Long id, String password, String role);

    void delete(Long id);
}
