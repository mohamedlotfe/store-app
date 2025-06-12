package com.codewithmo.storeapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/")
    public  String index(){
        String viewNAme = getViewName();
        System.out.println(appName);
        return viewNAme;
    }
    private String getViewName(){
        return "index.html";
    }
}
