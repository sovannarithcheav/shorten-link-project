package com.sovannarith.shortenlink.service;

import com.sovannarith.shortenlink.model.UrlShorten;
import com.sovannarith.shortenlink.model.dto.ShortenDTO;
import com.sovannarith.shortenlink.repository.UrlShortenRepository;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlShortenService implements IUrlShortenService {

    @Autowired
    private UrlShortenRepository repository;

    @Override
    public UrlShorten save(String original) {
        UrlShorten shorten = new UrlShorten(original);
        return repository.save(shorten);
    }
}
