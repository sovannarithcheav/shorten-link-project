package com.sovannarith.shortenlink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/index")
    public String returnIndex() {
        return "/index";
    }

}
