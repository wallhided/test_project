package com.miroshnik.service.impl;

import com.miroshnik.model.News;
import com.miroshnik.repository.NewsRepository;
import com.miroshnik.service.NewsService;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsRepository newsRepository;

    @Override
    public News save(News news) {

        return newsRepository.save(news);
    }

    @Override
    public void delete(int id) {
            newsRepository.delete(id);


    }

    @Override
    public News findById(int id) {
        return newsRepository.getOne(id);
    }

    @Override
    public List<News> printAll() {
        return newsRepository.findAll();
    }
}
