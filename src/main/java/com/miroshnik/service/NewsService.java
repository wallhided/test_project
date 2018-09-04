package com.miroshnik.service;


import com.miroshnik.model.News;

public interface NewsService {
    News save(String title);

    void delete(int id);

    void printAll();
}
