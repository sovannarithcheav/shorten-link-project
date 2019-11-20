package com.sovannarith.shortenlink.controller;

import com.sovannarith.shortenlink.model.UrlShorten;
import com.sovannarith.shortenlink.model.dto.ShortenDTO;
import com.sovannarith.shortenlink.service.IUrlShortenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping
public class MainController {

    @Autowired
    private IUrlShortenService shortenService;

    @PostMapping("")
    public UrlShorten save(@RequestBody ShortenDTO shortenDTO) {
        return shortenService.save(shortenDTO.getOriginal());
    }

    @GetMapping("/{shorten}")
    public ModelAndView redirectWithUsingRedirectPrefix(@PathVariable String shorten) {
        UrlShorten urlShorten = shortenService.getByShorten(shorten);
        return new ModelAndView("redirect:" + urlShorten.getOriginal());
    }

}
