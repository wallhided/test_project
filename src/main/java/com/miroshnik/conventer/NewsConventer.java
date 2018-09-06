package com.miroshnik.conventer;
import com.miroshnik.model.News;
import com.miroshnik.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

public class NewsConventer {

      private NewsService newsService2;

    public News toNews(HttpServletRequest request) {
        News news;
        String newsId = request.getParameter("newsId") ;
        if( newsId != null ){
            int id = Integer.valueOf(newsId);
            news = newsService2.findById(id );
        } else {
            news = new News();
        }

        String newsTitle = request.getParameter("newsTitle");
        String newsSource = request.getParameter("newsSource");
        String newsFulltext = request.getParameter("newsFulltext");
        news.setFulltext(newsFulltext);
        news.setSource(newsSource);
        news.setTitle(newsTitle);
        return news;
    }


}



