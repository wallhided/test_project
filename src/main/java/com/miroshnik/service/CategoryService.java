package com.miroshnik.service;

import com.miroshnik.model.Category;
import org.springframework.stereotype.Service;

public interface CategoryService{

    Category save(String name);

    void delete(int id);
}
