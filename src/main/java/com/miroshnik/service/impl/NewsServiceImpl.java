package com.miroshnik.service.impl;

import com.miroshnik.model.News;
import com.miroshnik.repository.NewsRepository;
import com.miroshnik.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsRepository newsRepository;

    @Override
    public News save(String title , String source , String fulltext) {
        News news = new News();
        news.setTitle(title);
        news.setSource(source);
        news.setFulltext(fulltext);
        return newsRepository.save(news);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<News> printAll() {
        return newsRepository.findAll();
    }
}
