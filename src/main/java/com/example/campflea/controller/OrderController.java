package com.example.campflea.controller;

import com.example.campflea.dto.JsonResult;
import com.example.campflea.entity.Shorder;
import com.example.campflea.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public JsonResult<Shorder> create(@RequestBody Shorder order) {
        return JsonResult.ok(orderService.createDraft(order));
    }

    @GetMapping
    public JsonResult<List<Shorder>> list() {
        return JsonResult.ok(orderService.list());
    }
}
