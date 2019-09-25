package com.sovannarith.shortenlink.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter@Setter
public class ShortenDTO {

    private String original;
    private String shorten;

}
