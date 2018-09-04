package com.miroshnik.service.impl;

import com.miroshnik.model.Category;
import com.miroshnik.repository.CategoryRepository;
import com.miroshnik.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category save(String name) {
        Category category = new Category();
        category.setName(name);
        return categoryRepository.save(category);
    }

    @Override
    public void delete(int id) {

    }
}
