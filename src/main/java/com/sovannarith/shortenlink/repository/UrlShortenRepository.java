package com.sovannarith.shortenlink.repository;

import com.sovannarith.shortenlink.model.UrlShorten;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlShortenRepository extends JpaRepository<UrlShorten, Integer> {
}
