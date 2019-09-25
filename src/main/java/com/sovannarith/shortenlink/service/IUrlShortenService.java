package com.sovannarith.shortenlink.service;

import com.sovannarith.shortenlink.model.UrlShorten;

public interface IUrlShortenService {

    public UrlShorten save(String original);

    UrlShorten getByShorten(String shorten);
}
