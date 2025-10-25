package com.codewithmike.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/")
    public String index() {
        //String viewName = getViewName();
        //System.out.println(viewName);
        System.out.println("Application Name: " + appName);
        return "index.html";
    }
    /*
    private String getViewName() {
        return "index.html ";
    }*/
}
