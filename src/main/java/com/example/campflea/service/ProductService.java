package com.example.campflea.service;

import com.example.campflea.entity.Shangpin;
import java.util.List;

public interface ProductService {
    Shangpin create(Shangpin shangpin);

    List<Shangpin> list();
}
