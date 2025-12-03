package com.example.campflea.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Shorder {
    private Long id;
    private Long buyerId;
    private Long sellerId;
    private BigDecimal amount;
    private String status;
    private LocalDateTime createdAt;
    private List<Orderitem> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<Orderitem> getItems() {
        return items;
    }

    public void setItems(List<Orderitem> items) {
        this.items = items;
    }
}
