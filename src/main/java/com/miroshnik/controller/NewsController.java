package com.miroshnik.controller;


import com.miroshnik.conventer.NewsConverter;
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
    private NewsService newsService;

    @Autowired
    private NewsConverter newsConverter;

    @RequestMapping(value = "/new-news", method = RequestMethod.POST)
    public String saveNewsPage(HttpServletRequest request, HttpServletResponse response, Model model) {

        News news = newsService.save(newsConverter.toNews(request));
        model.addAttribute("newsList", newsService.printAll()); //ты их не распечатываешь
        model.addAttribute("news", news);

        return "successTitle";
    }

    @RequestMapping(value = "/successdelete", method = RequestMethod.GET)
    public String deleteNewsPage(@RequestParam(name = "id", required = true) int id, HttpServletRequest request, HttpServletResponse response, Model model) {
        newsService.delete(id);
        return "/all-news";
    }

    @RequestMapping(value = "/editnews", method = RequestMethod.GET)
    public String editNewsPage(@RequestParam(name = "id", required = true) int id, HttpServletRequest request, HttpServletResponse response, Model model) {

        News news = newsService.findById(id);
        model.addAttribute("news", news);
        return "editNews";
    }



    @RequestMapping(value = "/all-news", method = RequestMethod.GET)
    public String showAllNews(Model model) {
        List<News> newsList = newsService.printAll();
        model.addAttribute("newsList", newsList);

        return "successTitle";
    }


    @RequestMapping(value = "/changeCatId", method = RequestMethod.GET)
    public String changeCatId(@RequestParam(name = "id", required = true) int id ,Model model , HttpServletRequest request){
        List<News> newsList = newsService.findByCatId(id);
        model.addAttribute("newsList", newsList);
             return "successTitle";
    }
    @RequestMapping(value = "/open",method = RequestMethod.GET)
    public String openNews(@RequestParam(name = "id", required = true) int id ,Model model , HttpServletRequest request){
        News news = newsService.findById(id);
        model.addAttribute("news", news);
        return "opened-news";
    }
}
