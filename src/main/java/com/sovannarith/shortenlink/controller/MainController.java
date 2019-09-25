package com.sovannarith.shortenlink.controller;

import com.sovannarith.shortenlink.model.UrlShorten;
import com.sovannarith.shortenlink.service.IUrlShortenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping
public class MainController {

    @Autowired
    private IUrlShortenService shortenService;

    @GetMapping("/")
    public UrlShorten save() {
        return shortenService.save("https://www.google.com.kh/search?q=short.url&oq=short.url&aqs=chrome..69i57j0l5.5823j0j0&client=ubuntu&sourceid=chrome&ie=UTF-8");
    }

    @GetMapping("/aaa")
    public ModelAndView redirectWithUsingRedirectPrefix() {
        return new ModelAndView("redirect:" + "https://www.google.com.kh/search?q=short.url&oq=short.url&aqs=chrome..69i57j0l5.5823j0j0&client=ubuntu&sourceid=chrome&ie=UTF-8");
    }

}
