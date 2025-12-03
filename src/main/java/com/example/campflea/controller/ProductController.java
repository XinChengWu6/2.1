package com.example.campflea.controller;

import com.example.campflea.dto.JsonResult;
import com.example.campflea.entity.Shangpin;
import com.example.campflea.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public JsonResult<Shangpin> create(@RequestBody Shangpin shangpin) {
        return JsonResult.ok(productService.create(shangpin));
    }

    @GetMapping
    public JsonResult<List<Shangpin>> list() {
        return JsonResult.ok(productService.list());
    }
}
