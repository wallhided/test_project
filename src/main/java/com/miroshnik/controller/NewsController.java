package com.miroshnik.controller;

import com.miroshnik.conventer.NewsConventer;
import com.miroshnik.model.News;
import com.miroshnik.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class NewsController {

    @Autowired
   private   NewsService newsService;
    @RequestMapping(value ="/new-news" , method = RequestMethod.POST)
    public String saveNewsPage(HttpServletRequest request, HttpServletResponse response, Model model){
        NewsConventer newsCon = new NewsConventer();

      News news = newsService.save(newsCon.toNews(request));
        List<News> newsList = newsService.printAll();
        model.addAttribute("newsList", newsList);
        model.addAttribute("news",news);

        return "successTitle";
    }
    @RequestMapping(value ="/successdelete" , method = RequestMethod.DELETE )
    public String deleteNewsPage(@RequestParam("id") int id ,HttpServletRequest request, HttpServletResponse response, Model model ){
        newsService.delete(id);
        return "success";
    }
}
