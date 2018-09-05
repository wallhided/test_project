package com.miroshnik.controller;

import com.miroshnik.model.News;
import com.miroshnik.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class NewsController {

    @Autowired
   private   NewsService newsService;
    @RequestMapping(value ="/new-news" , method = RequestMethod.POST)
    public String saveCategoryPage(HttpServletRequest request, HttpServletResponse response, Model model){
        String newsTitle = request.getParameter("newsTitle");
        String newsSource = request.getParameter("newsSource");
        String newsFulltext = request.getParameter("newsFulltext");
      News news = newsService.save(newsTitle ,newsSource,newsFulltext );
        List<News> newsList = newsService.printAll();
        model.addAttribute("newsList", newsList);
        model.addAttribute("news",news);

        return "successTitle";
    }

}
