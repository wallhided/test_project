package com.miroshnik.conventer;
import com.miroshnik.model.News;
import com.miroshnik.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;


@Component
public class NewsConverter {
    @Autowired
    private NewsService newsService;


    public News toNews(HttpServletRequest request) {

        News news;
        String newsId = request.getParameter("newsId");
        if (newsId!= null ) {

            news = newsService.findById(Integer.valueOf(newsId));
        }
        else news= new News();
        String newsCategoryId = request.getParameter("newsCategoryId");
        String newsTitle = request.getParameter("newsTitle");
        String newsSource = request.getParameter("newsSource");
        String newsFulltext = request.getParameter("newsFulltext");
        news.setFulltext(newsFulltext);
        news.setSource(newsSource);
        news.setTitle(newsTitle);
        if (newsCategoryId != null) {
            news.setCategoryId(Integer.valueOf(newsCategoryId));//
        }
        return news;
    }

}

