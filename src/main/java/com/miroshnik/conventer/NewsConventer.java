package com.miroshnik.conventer;
import com.miroshnik.model.News;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;


public class NewsConventer {
    News news = new News();

    public News toNews(HttpServletRequest request) {
        String newsTitle = request.getParameter("newsTitle");
        String newsSource = request.getParameter("newsSource");
        String newsFulltext = request.getParameter("newsFulltext");
        news.setFulltext(newsFulltext);
        news.setSource(newsSource);
        news.setTitle(newsTitle);
        return news;
    }

    public News findNewsById(HttpServletRequest request ) {
        String newsTitle = request.getParameter("newsTitle");
        String newsSource = request.getParameter("newsSource");
        String newsFulltext = request.getParameter("newsFulltext");

        return news;
    }
}



