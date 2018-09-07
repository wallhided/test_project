package com.miroshnik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping( value = "", method = RequestMethod.GET)
    public String showForm(){

        return "all-news";
    }


    @RequestMapping( value = "/todaynews", method = RequestMethod.GET)
    public String addNews(){

        return "todaynews";
    }
    @RequestMapping( value = "/index", method = RequestMethod.GET)
    public String newCattegoty(){

        return "index";
    }
}
