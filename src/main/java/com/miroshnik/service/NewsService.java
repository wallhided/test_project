package com.miroshnik.service;


import com.miroshnik.model.News;

import java.util.List;

public interface NewsService {
    News save(String title);

    void delete(int id);

    List<News> printAll();
}
