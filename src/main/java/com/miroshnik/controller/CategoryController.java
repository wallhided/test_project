package com.miroshnik.controller;

import com.miroshnik.model.Category;
import com.miroshnik.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/new-category", method = RequestMethod.POST)
        public String saveCategoryPage(HttpServletRequest request, HttpServletResponse response, Model model){
        String categoryName = request.getParameter("categoryName");
        Category category = categoryService.save(categoryName);
        model.addAttribute("category", category);
        return "successTitle";
    }
}
