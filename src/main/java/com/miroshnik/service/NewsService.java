package com.miroshnik.service;


import com.miroshnik.model.News;

import java.util.List;

public interface NewsService {
    News save(String title , String source ,String fulltext );

    void delete(int id);

    List<News> printAll();
}
