package com.sovannarith.shortenlink.service;

import com.sovannarith.shortenlink.model.UrlShorten;
import com.sovannarith.shortenlink.model.component.Links;
import org.springframework.stereotype.Service;

@Service
public class UrlShortenService implements IUrlShortenService {

    @Override
    public UrlShorten save(String original) {
        UrlShorten shorten = new UrlShorten(original);
        Links.urls.add(shorten);
        return shorten;
    }

    @Override
    public UrlShorten getByShorten(String shorten) {
        return Links.urls.stream().filter(urlShorten -> urlShorten.getShorten().equals(shorten)).findFirst().orElseGet(UrlShorten::new);
    }
}
