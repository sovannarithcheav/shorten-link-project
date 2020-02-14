package com.sovannarith.shortenlink.controller;

import com.sovannarith.shortenlink.model.UrlShorten;
import com.sovannarith.shortenlink.model.dto.ShortenDTO;
import com.sovannarith.shortenlink.service.IUrlShortenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

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
    public ResponseEntity<Object> redirectWithUsingRedirectPrefix(@PathVariable String shorten) {
        UrlShorten urlShorten = shortenService.getByShorten(shorten);
        HttpHeaders httpHeaders = new HttpHeaders();
        String url = urlShorten.getOriginal();
        if (!url.startsWith("http"))
            url = "http://" + url;
        URI uri = null;
        try {
            uri = new URI(url);
        } catch (URISyntaxException e) {
            return ResponseEntity.badRequest().build();
        }
        httpHeaders.setLocation(uri);
        return new ResponseEntity<>(httpHeaders, HttpStatus.SEE_OTHER);
    }

}
