package com.example.campflea.service.impl;

import com.example.campflea.entity.Shangpin;
import com.example.campflea.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductServiceImpl implements ProductService {

    private final ConcurrentHashMap<Long, Shangpin> store = new ConcurrentHashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(100L);

    @Override
    public Shangpin create(Shangpin shangpin) {
        Long id = idGenerator.getAndIncrement();
        shangpin.setId(id);
        store.put(id, shangpin);
        return shangpin;
    }

    @Override
    public List<Shangpin> list() {
        return new ArrayList<>(store.values());
    }
}
