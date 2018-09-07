package com.miroshnik.service;


import com.miroshnik.model.News;

import java.util.List;

public interface NewsService  {
    News save(News news );

    void delete(int id);

    News findById(int id);

    List<News> findByCatId(int categoryId);

    List<News> printAll();



}
