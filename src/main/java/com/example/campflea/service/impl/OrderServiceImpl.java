package com.example.campflea.service.impl;

import com.example.campflea.entity.Orderitem;
import com.example.campflea.entity.Shorder;
import com.example.campflea.service.OrderService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class OrderServiceImpl implements OrderService {

    private final CopyOnWriteArrayList<Shorder> orders = new CopyOnWriteArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(500L);

    @Override
    public Shorder createDraft(Shorder order) {
        order.setId(idGenerator.getAndIncrement());
        order.setStatus("CREATED");
        order.setCreatedAt(LocalDateTime.now());
        order.setAmount(calculateAmount(order.getItems()));
        orders.add(order);
        return order;
    }

    private BigDecimal calculateAmount(List<Orderitem> items) {
        if (items == null) {
            return BigDecimal.ZERO;
        }
        BigDecimal total = BigDecimal.ZERO;
        for (Orderitem item : items) {
            BigDecimal line = item.getPrice().multiply(new BigDecimal(item.getQuantity()));
            total = total.add(line);
        }
        return total;
    }

    @Override
    public List<Shorder> list() {
        return new ArrayList<>(orders);
    }
}
