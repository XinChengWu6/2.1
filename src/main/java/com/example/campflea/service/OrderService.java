package com.example.campflea.service;

import com.example.campflea.entity.Shorder;
import java.util.List;

public interface OrderService {
    Shorder createDraft(Shorder order);

    List<Shorder> list();
}
