package com.example.campflea.service.impl;

import com.example.campflea.entity.Users;
import com.example.campflea.service.UserService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserServiceImpl implements UserService {

    private final ConcurrentHashMap<Long, Users> store = new ConcurrentHashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(1L);

    @Override
    public Users register(String username, String password, String role) {
        Users users = new Users();
        users.setId(idGenerator.getAndIncrement());
        users.setUsername(username);
        users.setPassword(password);
        users.setRole(role);
        users.setCreatedAt(LocalDateTime.now());
        store.put(users.getId(), users);
        return users;
    }

    @Override
    public List<Users> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Users update(Long id, String password, String role) {
        Users users = store.get(id);
        if (users == null) {
            return null;
        }
        users.setPassword(password);
        users.setRole(role);
        return users;
    }

    @Override
    public void delete(Long id) {
        store.remove(id);
    }
}
